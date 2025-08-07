class Missing number{
public static void main(String []args){

int[] arr = {1,2,4,5,6,7,8,9,10};

int n = arr.length()+1;

int total = n*(n+1)/2;

for(int num : arr){

total-=num;

}

System.out.println("The Missing Number Is : "+total);
}

}