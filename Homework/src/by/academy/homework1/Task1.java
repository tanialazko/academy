package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sum = new Scanner(System.in);
		System.out.println("������� ����� �������: ");
		int x = sum.nextInt();
		Scanner age = new Scanner(System.in);
		System.out.println("������� ������� ����������: ");
		int b = age.nextInt(); 
		if(x<100) {
			System.out.println("��������� ���� � ������ ������ 5%: "+(x-(x*0.05)));
		} else if(100<=x&&x<200) {
			System.out.println("��������� ���� � ������ ������ 7%: "+(x-(x*0.07)));
			} else if(200<=x&&x<300){
				if(b>18) {
				System.out.println("��������� ���� � ������ ������ 12%: "+(x-(x*(0.12))));
				
				}
			} else if(300<=x&&x<400) {
				System.out.println("��������� ���� � ������ ������ 15%: "+(x-(x*0.15)));
			} else if(x>=400) {
				System.out.println("��������� ���� � ������ ������ 20%: "+(x-(x*0.2)));
			} if (200<=x&&x<300) {
				if (b>18) {
				System.out.println("��������� ���� � ������ ������ 12%+4%: "+(x-(x*(0.12+0.04))));
				} 
				} 
			}

			
		}
					
			
		
			
		
	

