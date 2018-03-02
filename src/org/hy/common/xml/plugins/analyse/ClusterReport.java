package org.hy.common.xml.plugins.analyse;

import org.hy.common.Date;
import org.hy.common.xml.SerializableDef;





/**
 * 集群的服务器信息
 *
 * @author      ZhengWei(HY)
 * @createDate  2018-03-02
 * @version     v1.0
 */
public class ClusterReport extends SerializableDef
{

    private static final long serialVersionUID = 849137073888555779L;
    
    
    /** 主机名称 */
    private String hostName;
    
    /** 启动时间 */
    private String startTime;
    
    /** 最大内存：Java虚拟机（这个进程）能构从操作系统那里挖到的最大的内存。JVM参数为：-Xmx */
    private long   maxMemory;
    
    /** 内存总量：Java虚拟机现在已经从操作系统那里挖过来的内存大小。JVM参数为：-Xms */
    private long   totalMemory;
    
    /** 空闲内存 */
    private long   freeMemory;
    
    /** 服务器情况（正常、异常） */
    private String serverStatus;
    
    
    
    public ClusterReport()
    {
        this.startTime    = "";
        this.maxMemory    = 0;
        this.totalMemory  = 0;
        this.freeMemory   = 0;
        this.hostName     = "";
        this.serverStatus = "";
    }
    
    
    
    public ClusterReport(Date i_StartTime)
    {
        Runtime v_RunTime = Runtime.getRuntime();
        
        this.startTime    = i_StartTime.getFull();
        this.maxMemory    = v_RunTime.maxMemory();
        this.totalMemory  = v_RunTime.totalMemory();
        this.freeMemory   = v_RunTime.freeMemory();
        this.hostName     = "";
        this.serverStatus = "";
    }


    
    /**
     * 获取：启动时间
     */
    public String getStartTime()
    {
        return startTime;
    }


    
    /**
     * 获取：最大内存：Java虚拟机（这个进程）能构从操作系统那里挖到的最大的内存。JVM参数为：-Xmx
     */
    public long getMaxMemory()
    {
        return maxMemory;
    }


    
    /**
     * 获取：内存总量：Java虚拟机现在已经从操作系统那里挖过来的内存大小。JVM参数为：-Xms
     */
    public long getTotalMemory()
    {
        return totalMemory;
    }


    
    /**
     * 获取：空闲内存
     */
    public long getFreeMemory()
    {
        return freeMemory;
    }
    

    
    /**
     * 设置：启动时间
     * 
     * @param startTime 
     */
    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }
    

    
    /**
     * 设置：最大内存：Java虚拟机（这个进程）能构从操作系统那里挖到的最大的内存。JVM参数为：-Xmx
     * 
     * @param maxMemory 
     */
    public void setMaxMemory(long maxMemory)
    {
        this.maxMemory = maxMemory;
    }
    

    
    /**
     * 设置：内存总量：Java虚拟机现在已经从操作系统那里挖过来的内存大小。JVM参数为：-Xms
     * 
     * @param totalMemory 
     */
    public void setTotalMemory(long totalMemory)
    {
        this.totalMemory = totalMemory;
    }
    

    
    /**
     * 设置：空闲内存
     * 
     * @param freeMemory 
     */
    public void setFreeMemory(long freeMemory)
    {
        this.freeMemory = freeMemory;
    }


    
    /**
     * 获取：主机名称
     */
    public String getHostName()
    {
        return hostName;
    }
    

    
    /**
     * 设置：主机名称
     * 
     * @param hostName 
     */
    public void setHostName(String hostName)
    {
        this.hostName = hostName;
    }

    

    /**
     * 获取：服务器情况（正常、异常）
     */
    public String getServerStatus()
    {
        return serverStatus;
    }
    

    
    /**
     * 设置：服务器情况（正常、异常）
     * 
     * @param serverStatus 
     */
    public void setServerStatus(String serverStatus)
    {
        this.serverStatus = serverStatus;
    }
    
}