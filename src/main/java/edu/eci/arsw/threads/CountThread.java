/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread{
    private int numA;
    private int numB;

	public CountThread(int numA, int numB)
    {
        this.numA=numA+1;
        this.numB=numB;
    }
    
    public void run()
    {
        for (int i=numA; i<numB; i++)
        {
            System.out.println(i);
        }
    }
    
}
