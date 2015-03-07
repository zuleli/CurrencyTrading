/* Author: Zule Li
 * Email:zule.li@hotmail.com
 * Last Modified Date:Mar.7,2015
 * */

package com.sms.forex.core;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class StartUp extends JFrame {
	public StartUp() {
		
		setTitle("Start Up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnConnection = new JButton("Connect");
		
		JButton btnTradingSation = new JButton("Trading Sation");
		btnTradingSation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnQuoteDisplay = new JButton("Quote Display");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(btnConnection)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnTradingSation)
					.addGap(9)
					.addComponent(btnQuoteDisplay))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnConnection)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnQuoteDisplay)
							.addComponent(btnTradingSation))))
		);
		getContentPane().setLayout(groupLayout);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartUp startup=new StartUp();
		startup.setVisible(true);

	}

}
