/***
 *
 * @author percy 冒泡法排序
 *
 *
 */
public class Bubble {
    private static long[] list=new long[20];
    private long[] Bubble_(long[] list){
        for (int i=0;i<list.length;i++){
            for (int j=i+1;j<list.length;j++){
                if (list[i]>list[j]){
                    Swap(list,i,j);
                }
            }

        }
        return list;
    }
    private void Swap(long[] list,int i,int j){
        long c= list[i];
        list[i] = list[j];
        list[j] = c;
    }
    public static void main(String[] args){

        for (int i=0;i<20;i++){
            list[i] = Math.round(Math.random()*10);
            System.out.print(list[i]+" ");
        }
        System.out.println("\n");
        System.out.println("------------");
        long[] tem = new Bubble().Bubble_(list);
        for (int i=0;i<tem.length;i++){

            System.out.print(tem[i]+" ");
        }
    }
}
