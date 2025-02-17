package ex;

public class Star21 {

/**
* 직삼각형을 프린트하는 함수
* **@param** num 직삼각형의 크기
*/

public void printTriangle(int num) {
//num = 6;
// *
// **
// ***
// ****
// *****
// ******

for (int i = 1; i <= num; i++) {
//i의 갯수만큼 출력
for (int j = 0; j < i; j++) {
System.out.print("*");
}

//별을 다찍은 후에 계행
System.out.println();
}
}

/**
* 뒤집힌 직삼각형을 프린트하는 함수
* **@param** num 뒤집힌 직삼각형의크기
*/

public void printReverseTriangle(int num) {
// ******
// *****
// ****
// ***
// **
// *

for (int i = 0; i < num; i++) {
//뒤집힌 직삼각형의크기 만큼 찍고 점차 마이너스 i
for (int j = 0; j < (num-i); j++) {
System.out.print("*");
}

//별을 다찍은 후에 계행
System.out.println();
}
}

/**
* 밀린 직삼각형을 프린트하는 함수
* **@param** num 밀린 직삼각형의크기
*/

public void printPushTriangle(int num) {
//        *
//       **
//      ***
//     ****
//    *****
//   ******

for (int i = 0; i < num; i++) {
//뒤집힌 직삼각형의크기 만큼 찍고 점차 마이너스 i
for (int j = 0; j < (num-i); j++) {
System.out.print(" ");
}

//i의 갯수만큼 출력 보정값 +1
for (int j = 0; j < (i+1); j++) {
System.out.print("*");
}

//별을 다찍은 후에 계행
System.out.println();
}
}

/**
*  이등변삼각형을 프린트하는 함수
* **@param** num 이등변삼각형의크기
*/

public void printPyramid(int num) {
//      *
//     ***
//    *****
//   *******
//  *********
// ***********

for (int i = 0; i < num; i++) {
//뒤집힌 직삼각형의크기 만큼 찍고 점차 마이너스 i
for (int j = 0; j < (num-i); j++) {
System.out.print(" ");
}

//i의 갯수*2 만큼 출력 보정값 +1
for (int j = 0; j < (2*i)+1; j++) {
System.out.print("*");
}

//별을 다찍은 후에 계행
System.out.println();
}
}

/**
*  이등변삼각형을 프린트하는 함수
* **@param** num 이등변삼각형의크기
*/

public void printPushPyramid(int push, int num) {
//      *
//     ***
//    *****
//   *******
//  *********
// ***********

for (int i = 0; i < num; i++) {
for (int j = 0; j < push; j++) {
System.out.print(" ");
}

//뒤집힌 직삼각형의크기 만큼 찍고 점차 마이너스 i
for (int j = 0; j < (num-i); j++) {
System.out.print(" ");
}

//i의 갯수*2 만큼 출력 보정값 +1
for (int j = 0; j < (2*i)+1; j++) {
System.out.print("*");
}

//별을 다찍은 후에 계행
System.out.println();
}
}

/**
* 뒤집힌 이등변삼각형을 프린트하는 함수
* **@param** num 뒤집힌 이등변삼각형의크기
*/

public void printReversePyramid(int num) {
// ***********
//  *********
//   *******
//    *****
//     ***
//      *

for (int i = 0; i < num; i++) {
//뒤집힌 직삼각형의크기 만큼 찍고 점차 마이너스 i
for (int j = 0; j <= i; j++) {
System.out.print(" ");
}

//i의 갯수*2 만큼 출력 보정값 -1
//뒤집을때
//i ->  (num-i)
//홀수개 증가할때(2씩증가할때)
//(i+1) -> (2*i)+1
//홀수개로 증가시켜놓고
//(2*i)+1
//i 대신에 (num-i) 대입해서 뒤집은것
//(2*(num-i))+1
//먼가 별이 2개 더나오네 일단 보정제거
//(2*(num-i))
//먼가 별이 1개 더나오네 -1 보정
//(2*(num-i)) -1

for (int j = 0; j < (2*(num-i))-1; j++) {
System.out.print("*");
}

//별을 다찍은 후에 계행
System.out.println();
}
}

/**
* 밀린 뒤집힌 이등변삼각형을 프린트하는 함수
* **@param** num 밀린 뒤집힌 이등변삼각형의크기
*/

public void printPushReversePyramid(int push, int num) {
for (int i = 0; i < num; i++) {
for (int j = 0; j < push; j++) {
System.out.print(" ");
}

//뒤집힌 직삼각형의크기 만큼 찍고 점차 마이너스 i
for (int j = 0; j <= i; j++) {
System.out.print(" ");
}

for (int j = 0; j < (2*(num-i))-1; j++) {
System.out.print("*");
}

//별을 다찍은 후에 계행
System.out.println();
}
}

/**
* 뒤집힌 이등변삼각형을 프린트하는 함수
* **@param** num 뒤집힌 이등변삼각형의크기
*/

public void printCutReverseBigPyramid(int num) {

//넘어온줄 곱하기 3
int bigNum = 3*num;
for (int i = 0; i < bigNum; i++) {

//넘어온 줄제한
if(i < num) {

//뒤집힌 직삼각형의크기 만큼 찍고 점차 마이너스 i

for (int j = 0; j <= i; j++) {
System.out.print(" ");
}

for (int j = 0; j < (2*(bigNum-i))-1; j++) {
System.out.print("*");
}

//별을 다찍은 후에 계행
System.out.println();
}
}

}

/**
*  이등변삼각형을 프린트하는 함수
* **@param** num 이등변삼각형의크기
*/

public void printCutBigPyramid(int num) {
//      *
//     ***
//    *****
//   *******
//  *********
// ***********

num *=3;

for (int i = 0; i < num; i++) {

if(i>(num-6)) {
//뒤집힌 직삼각형의크기 만큼 찍고 점차 마이너스 i
for (int j = 0; j < (num-i); j++) {

System.out.print(" ");
}

//i의 갯수*2 만큼 출력 보정값 +1
for (int j = 0; j < (2*i)+1; j++) {
System.out.print("*");
}

//별을 다찍은 후에 계행
System.out.println();
}
}

}

/**
*  이등변삼각형을 프린트하는 함수
* **@param** num 이등변삼각형의크기
*/

public void printCutBigHolePyramid(int num) {

int holeNum = num;

num *=3;

for (int i = 0; i < num; i++) {

if(i > (num-holeNum)) {

//뒤집힌 직삼각형의크기 만큼 찍고 점차 마이너스 i
for (int j = 0; j < (num-i); j++) {
System.out.print(" ");
}

//i의 갯수*2 만큼 출력 보정값 +1
for (int j = 0; j < (2*i)+1; j++) {
if((i-holeNum)-2*(i-(2*holeNum)) > j || j > (holeNum+i)+2*(i-(2*holeNum))) {
System.out.print("*");
} else {
System.out.print(" ");
}

}

//별을 다찍은 후에 계행
System.out.println();
}
}
}

public void printStar(int num) {

	printPushPyramid(2*num,num);
	printCutReverseBigPyramid(num);
	printCutBigPyramid(num);
	printPushReversePyramid(2*num,num);

	}

}
