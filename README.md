# Matrix Addition Program

This Java program allows the user to input two matrices of the same dimensions and provides the functionality to display and add them. Below is a detailed explanation of how the code works.

## Features
1. **Input Two Matrices:**  
   The program prompts the user to input the dimensions (rows and columns) of two matrices and allows the user to enter the elements of each matrix.

2. **Display Matrices:**  
   The entered matrices are displayed on the console in a matrix-like format for better readability.

3. **Matrix Addition (Future Feature):**  
   The program is designed to support adding two matrices of the same dimensions and display the result. Although the addition logic is present, the functionality is not yet invoked in the current `main` method.

## Code Explanation

### `getMatrixFromUser(String message, int rows, int cols, Scanner scanner)`
- **Purpose:**  
  This function takes a message prompt, the number of rows, columns, and a `Scanner` object as inputs. It then prompts the user to enter the elements of the matrix and returns the matrix in the form of a 2D array.
- **Working:**  
  The function iterates through each row and column of the matrix and asks the user to input the elements one by one, which are then stored in the corresponding positions in the 2D array.

### `displayMatrix(String label, int[][] matrix)`
- **Purpose:**  
  This function is responsible for printing the contents of the matrix to the console in a readable format.
- **Working:**  
  It iterates through each element of the matrix and prints it with appropriate spacing for visual clarity.

### `addMatrices(int[][] matrix1, int[][] matrix2)`
- **Purpose:**  
  This function takes two matrices as input, adds them element-wise, and returns the resulting matrix.
- **Working:**  
  It assumes that both matrices have the same dimensions. The function iterates through each element, adds corresponding elements from the two matrices, and stores the result in a new matrix.

### `main(String[] args)`
- **Purpose:**  
  This is the entry point of the program.
- **Working:**  
  1. Prompts the user to input the number of rows and columns for the matrices.
  2. Calls the `getMatrixFromUser()` method to input the first matrix and displays it using `displayMatrix()`.
  3. Repeats the process for the second matrix.
  4. Currently, the addition of the matrices is not invoked but can easily be done by calling the `addMatrices()` method.

## How to Use
1. Compile and run the program.
2. Enter the number of rows and columns when prompted.
3. Input the elements of the first matrix.
4. Input the elements of the second matrix.
5. (Optional) To add matrices, call the `addMatrices(matrix1, matrix2)` method inside the `main` method and display the result using `displayMatrix()`.

## Example
```text
Enter the number of rows: 2
Enter the number of columns: 2

Enter elements for the first matrix:
Enter element at position [0][0]: 1
Enter element at position [0][1]: 2
Enter element at position [1][0]: 3
Enter element at position [1][1]: 4

Matrix 1:
1 2
3 4

Enter elements for the second matrix:
Enter element at position [0][0]: 5
Enter element at position [0][1]: 6
Enter element at position [1][0]: 7
Enter element at position [1][1]: 8

Matrix 2:
5 6
7 8
