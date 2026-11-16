package com.example.test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
//        int a[]={10, 25, 7, 99, 42};
//        int max=0;
//        for (int i=0;i<a.length;i++){
//            if(a[i]>max){
//                max=a[i];
//            }
//        }
//        System.out.println(max);
//
//        int max1=Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
//        System.out.println(max1);
//        System.out.println("Start small. Ship something.");
//        int a[]={10, 25, 7, 99, 42};
//        int min=a[0];
//        for(int i=1;i<a.length;i++){
//            if(min>a[i]){
//                min=a[i];
//            }
//        }
//        System.out.println(min);
//
//        int min1 = Arrays.stream(a).boxed().sorted().findFirst().get();
//
//        System.out.println(min1);
//
//        int b[]={10, 25, 7, 99, 42};
//        Arrays.sort(b);
//        System.out.println(b[0]);
//        System.out.println(b[b.length-1]);
//
//        for(int c:b){
//            System.out.println(c);
//        }
//        int b[]={10, 25, 7, 99, 42};
//        int sum=0;
//        for(int c:b){
//            sum+=c;
//        }
//        System.out.println(sum);

//        int b[]={3, 3, 4};
//        double sum=0;
//        for(int c:b){
//            sum+=c;
//        }
//        double d=sum/b.length;
//        //  System.out.println(d);
//        double e=Arrays.stream(b).max().orElse(0);
//        System.out.println(e);

//
//        int b[]={10, 25, 7, 8, 42, 13,2};
//        int even=0;
//        int odd=0;
//        for(int a:b){
//            if(a%2==0){
//                even++;
//            }else{
//                odd++;
//            }
//        }
//        long even1 =      Arrays.stream(b).filter(i->i%2==0).count();
//        long odd1 = Arrays.stream(b).filter(i->i%2!=0).count();
//
//        int even=0;
//        int odd=0;
//        for(int a:b){
//            if(a%2==0){
//                even++;
//            }else{
//                odd++;
//            }
//        }
//        long even1 =      Arrays.stream(b).filter(i->i%2==0).count();
//        long odd1 = Arrays.stream(b).filter(i->i%2!=0).count();
//
//        Map<Boolean, List<Integer>> map=Arrays.stream(b).boxed().collect(Collectors.partitioningBy(i->i%2==0));
//
//        System.out.println(map);

//        int arr[]={1,2,4,5};
//        System.out.println(Arrays.toString(arr));
//
//        int b[]={10, 25, 7, 99, 42, -5};
//        reverseArray(b);
//        System.out.println(Arrays.toString(b));


//
//        int b[]={10, 25, 7, 99, 42, -5};
//        int a[] = Arrays.copyOf(b,7);
//        System.out.println(Arrays.toString(a));
//
//        int a[]={1,2,3,4,5,6};
//        int b[]={6,3,4,5,2,1};
//        boolean isSame=isArraySame(a,b);
//        System.out.println(isSame);
//
//        int a[]={1,2,3,4,5,6,6,3,4,5,2,1,6,3,4,5,2,1};
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int b:a){
//            map.put(b,map.getOrDefault(b,0)+1);
//        }
//        System.out.println(map);
//        Map<Integer,Long> m = Arrays.stream(a).boxed().collect(Collectors.groupingBy(i->i, Collectors.counting()));
//        System.out.println(m);


//
//
//        int a[]={10, 20, 10, 30, 20, 40, 20};
//
//        Set<Integer> seen=new LinkedHashSet<>();
//        Set<Integer> duplicate= new LinkedHashSet<>();
//
//        for(int b:a){
//            if(!seen.add(b)){
//                duplicate.add(b);
//            }
//        }
//        System.out.println(seen);
//        System.out.println(duplicate);
//        int a[]={10, 20, 10, 30, 20, 40, 20};
//
//        Set<Integer> seen=new HashSet<>();
//        Set<Integer> duplicate=
//                Arrays.stream(a).boxed().filter(i->!seen.add(i)).collect(Collectors.toSet());
//        System.out.println(seen);
//        System.out.println(duplicate);

//        int a[]={10, 25, 7, 99, 42};
//        int target=99;
//        for(int i=0;;i++){
//            if(target==a[i]){
//                System.out.print(i);
//                break;
//            }
//        }
//        int a[]={10, 20, 30, 40, 50, 60, 70};
//        int target=20;
//        int x=findTargetIndex(a,target);
//        System.out.println(x);
















}
//    public static int findTargetIndex(int[] a, int target){
//        int start =0;
//        int end = a.length-1;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(target==a[mid]){
//                return mid;
//            }
//            if(target>a[mid]){
//                start=mid+1;
//            } else{
//                end=mid-1;
//            }
//        }
//        return -1;
//    }
//    public static void reverseArray(int arr[]){
//        int start =0;
//        int end = arr.length-1;
//        while(start<end){
//            int temp=arr[start];
//            arr[start++]=arr[end];
//            arr[end--]=temp;
//        }
//    }

//    public static boolean isArraySame(int a[],int b[]){
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int c:a){
//            map.put(c, map.getOrDefault(c,0)+1);
//        }
//        for(int d:b){
//            if(!map.containsKey(d)){
//                return false;
//            }
//            map.put(d, map.get(d)-1);
//            if(map.get(d)==0){
//                map.remove(d);
//            }
//        }
//        return map.isEmpty();
//
//
//
//    }
}
