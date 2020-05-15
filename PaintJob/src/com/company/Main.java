package com.company;
//Bob is a wall painter and he needs help. A program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.
//A method named getBucketCount with 4 parameters. The first parameter should be named width of type double. This parameter represents the width of the wall.
//
//The second parameter should be named height of type double. This parameter represents the height of the wall.
//
//The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one bucket of paint.
//
//The fourth parameter should be named extraBuckets. This parameter represents the bucket count that Bob has at home.
//
//The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
//
//If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value.
//
//If all parameters are valid, the method needs to calculate the number of buckets and return it.
//
//2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
//
//Another overloaded method named getBucketCount with 3 parameters namely width, height, and areaPerBucket (all of type double).
//
//This method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
//
//If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to return -1 to indicate an invalid value.
//
//If all parameters are valid, the method needs to calculate the number of buckets and return it.
//
//3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write another method.
//
//Another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of type double).
//
//The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.
//
//If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1to indicate an invalid value.
//
//If all parameters are valid, the method needs to calculate the number of buckets and return it.
//

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // 3
        System.out.println();
        System.out.println(getBucketCount(-3.4, 2.1, 1.5)); // -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5)); // 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35)); // 14
        System.out.println();
        System.out.println(getBucketCount(3.4, 1.5)); // 3
        System.out.println(getBucketCount(6.26, 2.2)); // 3
        System.out.println(getBucketCount(3.26, 0.75)); // 5

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBucket) {
        int getBucketCount;
        double area = width * height;
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBucket < 0) {
            getBucketCount = -1;
        } else {
            getBucketCount = (int) Math.ceil(area / areaPerBucket);
            if (extraBucket > 0 && getBucketCount >= extraBucket ) {
                getBucketCount -= extraBucket;
            }
        }
        return getBucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int getBucketCount;
        double area = width * height;
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0) {
            getBucketCount = -1;
        } else {
            getBucketCount = (int) Math.ceil(area / areaPerBucket);
        }
        return getBucketCount;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int getBucketCount;
        if (area <= 0.0 || areaPerBucket <= 0.0) {
            getBucketCount = -1;
        } else {
            getBucketCount = (int) Math.ceil(area / areaPerBucket);
        }
        return getBucketCount;
    }
}
