package org.arrays;

public class Arrays {
public static void main(String[] args) {
	int i[]= new int[10];
	i[0]=1;
	i[1]=2;
	i[2]=3;
	i[3]=4;
	i[4]=5;
	i[5]=6;
	i[6]=7;
	i[7]=8;
	i[8]=9;
	i[9]=10;
	System.out.println(i.length);
	int count = 0;
	float avj = 0;
	for (int j = 0; j < i.length; j++) {
		count = count+i[j];
		avj=count/i.length;
	}
	System.out.println(count);
	System.out.println(avj);
}
}
