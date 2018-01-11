#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define size 200
struct student {
	int studentRoleNumber;
	char *studentName;
}*firstStudent, *secondStudent;

FILE *outputFile, *tempFile;
int count = 0;

void createStudentRecord() {
	int i;
	char *p;
	firstStudent = (struct student *) malloc(sizeof(struct student));
	firstStudent->studentName = (char *) malloc((size) * (sizeof(char)));
	printf("Enter name of student : ");
	scanf(" %s", firstStudent->studentName);
	printf("Enter student Role Number : ");
	scanf(" %d", &firstStudent->studentRoleNumber);
	fwrite(&firstStudent->studentRoleNumber, sizeof(firstStudent->studentRoleNumber), 1, outputFile);
	fwrite(firstStudent->studentName, size, 1, outputFile);
	count++;
	fclose(outputFile);
}

void displayStudentRecords() {
	secondStudent = (struct student*) malloc(1 * sizeof(struct student));
	secondStudent->studentName = (char *) malloc(size * sizeof(char));
	int i = 1;
	if (tempFile == NULL)
		printf("\nFile not opened for reading");
	while (i <= count) {
		fread(&secondStudent->studentRoleNumber, sizeof(secondStudent->studentRoleNumber), 1, tempFile);
		fread(secondStudent->studentName, size, 1, tempFile);
		printf("\n%d %s", secondStudent->studentRoleNumber, secondStudent->studentName);
		i++;
	}
	fclose(tempFile);
	free(secondStudent->studentName);
	free(secondStudent);
}
void updateRecord() {
	int roleNumber, flag = 0, i = 1;
	char tempName[size];
	if (tempFile == NULL) {
		printf("File can't be opened or not exits plz check the file");
		return;
	}
	printf("Enter student RoleNumber  to update : ");
	scanf("%d", &roleNumber);
	secondStudent = (struct student*) malloc(1 * sizeof(struct student));
	secondStudent->studentName = (char *) malloc(size * sizeof(char));
	while (i <= count) {
		fread(&secondStudent->studentRoleNumber, sizeof(secondStudent->studentRoleNumber), 1, tempFile);
		fread(secondStudent->studentName, size, 1, tempFile);

		if (roleNumber == secondStudent->studentRoleNumber) {
			printf("Enter new name of student to update : ");
			scanf(" %s", tempName);
			fseek(tempFile, -204L, SEEK_CUR);
			fwrite(&secondStudent->studentRoleNumber, sizeof(secondStudent->studentRoleNumber), 1, tempFile);
			fwrite(tempName, size, 1, tempFile);
			flag = 1;
			break;
		}
		i++;
	}
	if (flag != 1) {
		printf("No student record found");
		flag = 0;
	}
	fclose(tempFile);
	free(secondStudent->studentName);
	free(secondStudent);
}
int  main(int argc, char **argv) {
	int option;
	printf("1. Create a Student Record\n");
	printf("2. Update Record of student \n");
	printf("3. Print Records\n");
	printf("4. Quit");
	while (1) {
		printf("\nEnter your option : ");
		scanf("%d", &option);
		switch (option) {
		case 1:
			outputFile = fopen(argv[1], "a");
			createStudentRecord();
			break;
		case 2:
			tempFile = fopen(argv[1], "r+");
			updateRecord();
			break;
		case 3:

			tempFile = fopen(argv[1], "rb");
			displayStudentRecords();
			break;
		case 4:
			exit(0);
		}
	}
}

