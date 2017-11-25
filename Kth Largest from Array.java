class Solution {
    public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);
//         for(int i=0;i<nums.length;i++){
//             pq.offer(nums[i]);
//             if(pq.size()>k){
//                 pq.poll();
//             }
//         }
        
//         int res=pq.poll();
//         return res;
        return randomizedSelect(nums,0,nums.length-1,nums.length-k+1);
    }
    
    private int randomizedSelect(int[] A,int p,int r,int i){
        if(p==r){
            return A[p];
        }
        int q=randomizedPartition(A,p,r);
        int k=q-p+1;
        if(i==k){
            return A[q];
        }else if(i<k){
            return randomizedSelect(A,p,q-1,i);
        }else{
            return randomizedSelect(A,q+1,r,i-k);
        }
    }
    
    private int randomizedPartition(int[] A,int p,int r){
        Random random=new Random();
		int i=random.nextInt(r)%(r-p+1)+p;
        swap(A,r,i);
        return partition(A,p,r);
    }
    
	private int partition(int[] A,int p,int r) {
		int pivot=A[r];
		int i=p-1;

		for (int j=p; j<r; j++) {
			if (A[j]<pivot) {
				i=i+1;
                swap(A,i,j);
			}
		}
        swap(A,i+1,r);

		return i+1;
	}
    
    private void swap(int[] A,int a,int b){
        int tmp=A[a];
        A[a]=A[b];
        A[b]=tmp;
    }
}
