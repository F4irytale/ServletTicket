
package mybean.data;
import com.sun.rowset.*; 
public class Chaxun{
    CachedRowSetImpl rowSet=null;         //�洢����ȫ����¼���м�����
    int pageSize=50;                      //ÿҳ��ʾ�ļ�¼��
    int totalPages=1;                     //��ҳ�����ҳ��
    int currentPage =1   ;                 //��ǰ��ʾҳ 
    public void setRowSet(CachedRowSetImpl set){
       rowSet=set;
    }
    public CachedRowSetImpl getRowSet(){
       return rowSet;
    }
    public void setPageSize(int size){
       pageSize=size;
    }
    public int getPageSize(){
       return pageSize;
    } 
    public int getTotalPages(){
       return totalPages;
    } 
    public void setTotalPages(int n){
       totalPages=n; 
    }
    public void setCurrentPage(int n){
       currentPage =n;
    }
    public int getCurrentPage(){
       return currentPage ;
    }
}
