package com.who.tommy.entity;

public class SysPermissions {
    private Long id;

    private String permission;

    private String description;

    private Long rid;

    private Boolean available;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public static void main(String[] args) {


        System.out.println((1+2126753390)/2);
        System.out.println((1063376695+2126753390)/2);
        int mid=(int)Math.floor(((double)1063376695+(double)2126753390)/2);
        System.out.println(mid);




        //merge(new int[]{0},0,new int[]{1},1);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0) {
            nums1=nums2;
            return;
        }
        if(n==0) return;
        int c=m+n-1;
        int i=m-1;
        int j=n-1;
        int min=nums1[i];
        int max=nums2[j];
        while(j>-1&&i>-1){
            max=nums2[j];
            if(min>max){
                nums1[c--]=min;
                if(i==0){
                    for(int ii=0;ii<j+1;ii++){
                        nums1[ii]=nums2[ii];
                    }
                    break;
                }
                min=nums1[--i];
            }
            else{
                nums1[c--]=max;
                j--;
            }
        }

    }
}