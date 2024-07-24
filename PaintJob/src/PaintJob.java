public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (height <= 0 || width <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double result = ((width * height) / areaPerBucket) - extraBuckets;
        return (int) Math.ceil(result);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (height <= 0 || width <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double result = width * height / areaPerBucket;
        return (int) Math.ceil(result);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        }
        return ((int) (Math.ceil(area / areaPerBucket)));
    }
}

