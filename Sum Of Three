/* find list three no.in list whose sum is 0
 *failing testcase :[0,0,0,0]
 * it was giving two pair of such answer [0,0,0] and  [0,0,0]
 *and [-2,0,1,1,2] answer should [-2,1,1] and [-2,0,2]
 *[1,-1,-1,0]  Output: [[-1,0,1],[-1,0,1]] same output so removed same pair by using set
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l=nums.length;
        int i,j;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        boolean already=false;
        for(i=0;i<l;i++)
        { int right=l-1,left=i+1;
           while(left<right)
           {
             int sum=nums[i]+nums[left]+nums[right];
               if(sum==0)
               { if(already) break;
                    if(nums[i]==nums[left]&&nums[left]==nums[right])
                    already=true;
                   res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                   left++;
                   right--;
               }
               else if(sum>0) right--;
               else left++;
           }
        }
        
Set<List<Integer>> hs = new HashSet<>();  //to remove duplicate pairs
hs.addAll(res);
res.clear();
res.addAll(hs);
        return res;
    }
}
