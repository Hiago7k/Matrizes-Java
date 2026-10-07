public class IntersecaoDeArrays {
    static void main() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};


        for (int i = 0; i < nums1.length; i++){
            for (int j = 1; j < nums1.length -1; j++){
                if (nums1[i] == nums1[j]){
                    System.out.println("Tem duplicado");
                }else {
                    System.out.printf("%d ", nums1[i]);
                }
            }
        }
//
//        for (int j = 0; j < nums2.length; j++){
//            System.out.println(nums1[j]);
//        }


    }
}
