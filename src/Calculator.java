import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author Mehreen Malik
 * mehreenmalik08@gmail.com
 * ITB GPA calculator.
 */

public class Calculator extends JFrame implements ActionListener
{
	int i;
	JPanel subjectsPanel;
	
	JTextField tfGrade1, tfCredit1, tfGrade2, tfCredit2, tfGrade3, tfCredit3, tfGrade4, tfCredit4, tfGrade5, tfCredit5, tfGrade6, tfCredit6, 
	tfGrade7, tfCredit7, tfGrade8, tfCredit8, tfGrade9, tfCredit9, tfGrade10, tfCredit10, tfGrade11, tfCredit11, tfGrade12, tfCredit12;
	
	JLabel tfValue1, tfValue2, tfValue3, tfValue4, tfValue5, tfValue6, tfValue7, tfValue8, tfValue9, tfValue10, tfValue11, tfValue12,
	tfTotal;
	
	Calculator()
	{
		super("GPA Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		JPanel topPanel = new JPanel();
		JLabel numberSubjects = new JLabel("Select number of subjects: ");
		
		String[] numberStrings = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		JComboBox numberList = new JComboBox(numberStrings);
		numberList.setSelectedIndex(0);
		
		numberList.addActionListener(new ActionListener()
		{	 
		    @Override
		    public void actionPerformed(ActionEvent event)
		    {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String selectedSub = (String) combo.getSelectedItem();
		 
		        if (selectedSub.equals("1"))
		        {		            
		        	i=1;
		            //remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		    		
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		
		    		//TODO: ADD verifier
		    		//tfGrade1.setInputVerifier(new GradeInputVerifier());
		    		
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		            pack();
		        }
		        
		        else if (selectedSub.equals("2"))
		        {
		        	i=2;
		            //remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		            
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelSubject2 = new JLabel("Subject 2");
		    		tfGrade2 = new JTextField(5);
		    		tfCredit2 = new JTextField(5);
		    		tfValue2 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject2);
		    		subjectsPanel.add(tfGrade2);
		    		subjectsPanel.add(tfCredit2);
		    		subjectsPanel.add(tfValue2);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		    		pack();
		        }
		        
		        else if (selectedSub.equals("3"))
		        {		          
		        	i=3;
		            //remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		            
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelSubject2 = new JLabel("Subject 2");
		    		tfGrade2 = new JTextField(5);
		    		tfCredit2 = new JTextField(5);
		    		tfValue2 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject2);
		    		subjectsPanel.add(tfGrade2);
		    		subjectsPanel.add(tfCredit2);
		    		subjectsPanel.add(tfValue2);
		    		
		    		JLabel labelSubject3 = new JLabel("Subject 3");
		    		tfGrade3 = new JTextField(5);
		    		tfCredit3 = new JTextField(5);
		    		tfValue3 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject3);
		    		subjectsPanel.add(tfGrade3);
		    		subjectsPanel.add(tfCredit3);
		    		subjectsPanel.add(tfValue3);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		    		pack();
		        }
		        
		        else if (selectedSub.equals("4"))
		        {		    
		        	i=4;
		        	//remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		            
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelSubject2 = new JLabel("Subject 2");
		    		tfGrade2 = new JTextField(5);
		    		tfCredit2 = new JTextField(5);
		    		tfValue2 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject2);
		    		subjectsPanel.add(tfGrade2);
		    		subjectsPanel.add(tfCredit2);
		    		subjectsPanel.add(tfValue2);
		    		
		    		JLabel labelSubject3 = new JLabel("Subject 3");
		    		tfGrade3 = new JTextField(5);
		    		tfCredit3 = new JTextField(5);
		    		tfValue3 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject3);
		    		subjectsPanel.add(tfGrade3);
		    		subjectsPanel.add(tfCredit3);
		    		subjectsPanel.add(tfValue3);
		    		
		    		JLabel labelSubject4 = new JLabel("Subject 4");
		    		tfGrade4 = new JTextField(5);
		    		tfCredit4 = new JTextField(5);
		    		tfValue4 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject4);
		    		subjectsPanel.add(tfGrade4);
		    		subjectsPanel.add(tfCredit4);
		    		subjectsPanel.add(tfValue4);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		    		pack();	
		        }
		        
		        else if (selectedSub.equals("5"))
		        {		   
		        	i=5;
		        	//remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		            
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelSubject2 = new JLabel("Subject 2");
		    		tfGrade2 = new JTextField(5);
		    		tfCredit2 = new JTextField(5);
		    		tfValue2 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject2);
		    		subjectsPanel.add(tfGrade2);
		    		subjectsPanel.add(tfCredit2);
		    		subjectsPanel.add(tfValue2);
		    		
		    		JLabel labelSubject3 = new JLabel("Subject 3");
		    		tfGrade3 = new JTextField(5);
		    		tfCredit3 = new JTextField(5);
		    		tfValue3 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject3);
		    		subjectsPanel.add(tfGrade3);
		    		subjectsPanel.add(tfCredit3);
		    		subjectsPanel.add(tfValue3);
		    		
		    		JLabel labelSubject4 = new JLabel("Subject 4");
		    		tfGrade4 = new JTextField(5);
		    		tfCredit4 = new JTextField(5);
		    		tfValue4 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject4);
		    		subjectsPanel.add(tfGrade4);
		    		subjectsPanel.add(tfCredit4);
		    		subjectsPanel.add(tfValue4);
		    		
		    		JLabel labelSubject5 = new JLabel("Subject 5");
		    		tfGrade5 = new JTextField(5);
		    		tfCredit5 = new JTextField(5);
		    		tfValue5 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject5);
		    		subjectsPanel.add(tfGrade5);
		    		subjectsPanel.add(tfCredit5);
		    		subjectsPanel.add(tfValue5);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		    		pack();	
		        }
		        
		        else if (selectedSub.equals("6"))
		        {		
		        	i=6;
		        	//remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		            
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelSubject2 = new JLabel("Subject 2");
		    		tfGrade2 = new JTextField(5);
		    		tfCredit2 = new JTextField(5);
		    		tfValue2 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject2);
		    		subjectsPanel.add(tfGrade2);
		    		subjectsPanel.add(tfCredit2);
		    		subjectsPanel.add(tfValue2);
		    		
		    		JLabel labelSubject3 = new JLabel("Subject 3");
		    		tfGrade3 = new JTextField(5);
		    		tfCredit3 = new JTextField(5);
		    		tfValue3 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject3);
		    		subjectsPanel.add(tfGrade3);
		    		subjectsPanel.add(tfCredit3);
		    		subjectsPanel.add(tfValue3);
		    		
		    		JLabel labelSubject4 = new JLabel("Subject 4");
		    		tfGrade4 = new JTextField(5);
		    		tfCredit4 = new JTextField(5);
		    		tfValue4 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject4);
		    		subjectsPanel.add(tfGrade4);
		    		subjectsPanel.add(tfCredit4);
		    		subjectsPanel.add(tfValue4);
		    		
		    		JLabel labelSubject5 = new JLabel("Subject 5");
		    		tfGrade5 = new JTextField(5);
		    		tfCredit5 = new JTextField(5);
		    		tfValue5 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject5);
		    		subjectsPanel.add(tfGrade5);
		    		subjectsPanel.add(tfCredit5);
		    		subjectsPanel.add(tfValue5);
		    		
		    		JLabel labelSubject6 = new JLabel("Subject 6");
		    		tfGrade6 = new JTextField(5);
		    		tfCredit6 = new JTextField(5);
		    		tfValue6 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject6);
		    		subjectsPanel.add(tfGrade6);
		    		subjectsPanel.add(tfCredit6);
		    		subjectsPanel.add(tfValue6);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		    		pack();		
		        }
		        
		        else if (selectedSub.equals("7"))
		        {		  
		        	i=7;
		        	//remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		            
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelSubject2 = new JLabel("Subject 2");
		    		tfGrade2 = new JTextField(5);
		    		tfCredit2 = new JTextField(5);
		    		tfValue2 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject2);
		    		subjectsPanel.add(tfGrade2);
		    		subjectsPanel.add(tfCredit2);
		    		subjectsPanel.add(tfValue2);
		    		
		    		JLabel labelSubject3 = new JLabel("Subject 3");
		    		tfGrade3 = new JTextField(5);
		    		tfCredit3 = new JTextField(5);
		    		tfValue3 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject3);
		    		subjectsPanel.add(tfGrade3);
		    		subjectsPanel.add(tfCredit3);
		    		subjectsPanel.add(tfValue3);
		    		
		    		JLabel labelSubject4 = new JLabel("Subject 4");
		    		tfGrade4 = new JTextField(5);
		    		tfCredit4 = new JTextField(5);
		    		tfValue4 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject4);
		    		subjectsPanel.add(tfGrade4);
		    		subjectsPanel.add(tfCredit4);
		    		subjectsPanel.add(tfValue4);
		    		
		    		JLabel labelSubject5 = new JLabel("Subject 5");
		    		tfGrade5 = new JTextField(5);
		    		tfCredit5 = new JTextField(5);
		    		tfValue5 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject5);
		    		subjectsPanel.add(tfGrade5);
		    		subjectsPanel.add(tfCredit5);
		    		subjectsPanel.add(tfValue5);
		    		
		    		JLabel labelSubject6 = new JLabel("Subject 6");
		    		tfGrade6 = new JTextField(5);
		    		tfCredit6 = new JTextField(5);
		    		tfValue6 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject6);
		    		subjectsPanel.add(tfGrade6);
		    		subjectsPanel.add(tfCredit6);
		    		subjectsPanel.add(tfValue6);
		    		
		    		JLabel labelSubject7 = new JLabel("Subject 7");
		    		tfGrade7 = new JTextField(5);
		    		tfCredit7 = new JTextField(5);
		    		tfValue7 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject7);
		    		subjectsPanel.add(tfGrade7);
		    		subjectsPanel.add(tfCredit7);
		    		subjectsPanel.add(tfValue7);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		    		pack();	
		        }
		        
		        else if (selectedSub.equals("8"))
		        {		
		        	i=8;
		        	//remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		            
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelSubject2 = new JLabel("Subject 2");
		    		tfGrade2 = new JTextField(5);
		    		tfCredit2 = new JTextField(5);
		    		tfValue2 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject2);
		    		subjectsPanel.add(tfGrade2);
		    		subjectsPanel.add(tfCredit2);
		    		subjectsPanel.add(tfValue2);
		    		
		    		JLabel labelSubject3 = new JLabel("Subject 3");
		    		tfGrade3 = new JTextField(5);
		    		tfCredit3 = new JTextField(5);
		    		tfValue3 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject3);
		    		subjectsPanel.add(tfGrade3);
		    		subjectsPanel.add(tfCredit3);
		    		subjectsPanel.add(tfValue3);
		    		
		    		JLabel labelSubject4 = new JLabel("Subject 4");
		    		tfGrade4 = new JTextField(5);
		    		tfCredit4 = new JTextField(5);
		    		tfValue4 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject4);
		    		subjectsPanel.add(tfGrade4);
		    		subjectsPanel.add(tfCredit4);
		    		subjectsPanel.add(tfValue4);
		    		
		    		JLabel labelSubject5 = new JLabel("Subject 5");
		    		tfGrade5 = new JTextField(5);
		    		tfCredit5 = new JTextField(5);
		    		tfValue5 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject5);
		    		subjectsPanel.add(tfGrade5);
		    		subjectsPanel.add(tfCredit5);
		    		subjectsPanel.add(tfValue5);
		    		
		    		JLabel labelSubject6 = new JLabel("Subject 6");
		    		tfGrade6 = new JTextField(5);
		    		tfCredit6 = new JTextField(5);
		    		tfValue6 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject6);
		    		subjectsPanel.add(tfGrade6);
		    		subjectsPanel.add(tfCredit6);
		    		subjectsPanel.add(tfValue6);
		    		
		    		JLabel labelSubject7 = new JLabel("Subject 7");
		    		tfGrade7 = new JTextField(5);
		    		tfCredit7 = new JTextField(5);
		    		tfValue7 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject7);
		    		subjectsPanel.add(tfGrade7);
		    		subjectsPanel.add(tfCredit7);
		    		subjectsPanel.add(tfValue7);
		    		
		    		JLabel labelSubject8 = new JLabel("Subject 8");
		    		tfGrade8 = new JTextField(5);
		    		tfCredit8 = new JTextField(5);
		    		tfValue8 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject8);
		    		subjectsPanel.add(tfGrade8);
		    		subjectsPanel.add(tfCredit8);
		    		subjectsPanel.add(tfValue8);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		    		pack();	
		        }
		        
		        else if (selectedSub.equals("9"))
		        {		        
		        	i=9;
		        	//remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		            
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelSubject2 = new JLabel("Subject 2");
		    		tfGrade2 = new JTextField(5);
		    		tfCredit2 = new JTextField(5);
		    		tfValue2 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject2);
		    		subjectsPanel.add(tfGrade2);
		    		subjectsPanel.add(tfCredit2);
		    		subjectsPanel.add(tfValue2);
		    		
		    		JLabel labelSubject3 = new JLabel("Subject 3");
		    		tfGrade3 = new JTextField(5);
		    		tfCredit3 = new JTextField(5);
		    		tfValue3 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject3);
		    		subjectsPanel.add(tfGrade3);
		    		subjectsPanel.add(tfCredit3);
		    		subjectsPanel.add(tfValue3);
		    		
		    		JLabel labelSubject4 = new JLabel("Subject 4");
		    		tfGrade4 = new JTextField(5);
		    		tfCredit4 = new JTextField(5);
		    		tfValue4 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject4);
		    		subjectsPanel.add(tfGrade4);
		    		subjectsPanel.add(tfCredit4);
		    		subjectsPanel.add(tfValue4);
		    		
		    		JLabel labelSubject5 = new JLabel("Subject 5");
		    		tfGrade5 = new JTextField(5);
		    		tfCredit5 = new JTextField(5);
		    		tfValue5 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject5);
		    		subjectsPanel.add(tfGrade5);
		    		subjectsPanel.add(tfCredit5);
		    		subjectsPanel.add(tfValue5);
		    		
		    		JLabel labelSubject6 = new JLabel("Subject 6");
		    		tfGrade6 = new JTextField(5);
		    		tfCredit6 = new JTextField(5);
		    		tfValue6 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject6);
		    		subjectsPanel.add(tfGrade6);
		    		subjectsPanel.add(tfCredit6);
		    		subjectsPanel.add(tfValue6);
		    		
		    		JLabel labelSubject7 = new JLabel("Subject 7");
		    		tfGrade7 = new JTextField(5);
		    		tfCredit7 = new JTextField(5);
		    		tfValue7 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject7);
		    		subjectsPanel.add(tfGrade7);
		    		subjectsPanel.add(tfCredit7);
		    		subjectsPanel.add(tfValue7);
		    		
		    		JLabel labelSubject8 = new JLabel("Subject 8");
		    		tfGrade8 = new JTextField(5);
		    		tfCredit8 = new JTextField(5);
		    		tfValue8 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject8);
		    		subjectsPanel.add(tfGrade8);
		    		subjectsPanel.add(tfCredit8);
		    		subjectsPanel.add(tfValue8);
		    		
		    		JLabel labelSubject9 = new JLabel("Subject 9");
		    		tfGrade9 = new JTextField(5);
		    		tfCredit9 = new JTextField(5);
		    		tfValue9 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject9);
		    		subjectsPanel.add(tfGrade9);
		    		subjectsPanel.add(tfCredit9);
		    		subjectsPanel.add(tfValue9);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		    		pack();	
		        }
		        
		        else if (selectedSub.equals("10"))
		        {		            
		        	i=10;
		        	//remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		            
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelSubject2 = new JLabel("Subject 2");
		    		tfGrade2 = new JTextField(5);
		    		tfCredit2 = new JTextField(5);
		    		tfValue2 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject2);
		    		subjectsPanel.add(tfGrade2);
		    		subjectsPanel.add(tfCredit2);
		    		subjectsPanel.add(tfValue2);
		    		
		    		JLabel labelSubject3 = new JLabel("Subject 3");
		    		tfGrade3 = new JTextField(5);
		    		tfCredit3 = new JTextField(5);
		    		tfValue3 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject3);
		    		subjectsPanel.add(tfGrade3);
		    		subjectsPanel.add(tfCredit3);
		    		subjectsPanel.add(tfValue3);
		    		
		    		JLabel labelSubject4 = new JLabel("Subject 4");
		    		tfGrade4 = new JTextField(5);
		    		tfCredit4 = new JTextField(5);
		    		tfValue4 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject4);
		    		subjectsPanel.add(tfGrade4);
		    		subjectsPanel.add(tfCredit4);
		    		subjectsPanel.add(tfValue4);
		    		
		    		JLabel labelSubject5 = new JLabel("Subject 5");
		    		tfGrade5 = new JTextField(5);
		    		tfCredit5 = new JTextField(5);
		    		tfValue5 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject5);
		    		subjectsPanel.add(tfGrade5);
		    		subjectsPanel.add(tfCredit5);
		    		subjectsPanel.add(tfValue5);
		    		
		    		JLabel labelSubject6 = new JLabel("Subject 6");
		    		tfGrade6 = new JTextField(5);
		    		tfCredit6 = new JTextField(5);
		    		tfValue6 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject6);
		    		subjectsPanel.add(tfGrade6);
		    		subjectsPanel.add(tfCredit6);
		    		subjectsPanel.add(tfValue6);
		    		
		    		JLabel labelSubject7 = new JLabel("Subject 7");
		    		tfGrade7 = new JTextField(5);
		    		tfCredit7 = new JTextField(5);
		    		tfValue7 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject7);
		    		subjectsPanel.add(tfGrade7);
		    		subjectsPanel.add(tfCredit7);
		    		subjectsPanel.add(tfValue7);
		    		
		    		JLabel labelSubject8 = new JLabel("Subject 8");
		    		tfGrade8 = new JTextField(5);
		    		tfCredit8 = new JTextField(5);
		    		tfValue8 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject8);
		    		subjectsPanel.add(tfGrade8);
		    		subjectsPanel.add(tfCredit8);
		    		subjectsPanel.add(tfValue8);
		    		
		    		JLabel labelSubject9 = new JLabel("Subject 9");
		    		tfGrade9 = new JTextField(5);
		    		tfCredit9 = new JTextField(5);
		    		tfValue9 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject9);
		    		subjectsPanel.add(tfGrade9);
		    		subjectsPanel.add(tfCredit9);
		    		subjectsPanel.add(tfValue9);
		    		
		    		JLabel labelSubject10 = new JLabel("Subject 10");
		    		tfGrade10 = new JTextField(5);
		    		tfCredit10 = new JTextField(5);
		    		tfValue10 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject10);
		    		subjectsPanel.add(tfGrade10);
		    		subjectsPanel.add(tfCredit10);
		    		subjectsPanel.add(tfValue10);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		    		pack();	
		        }
		        
		        else if (selectedSub.equals("11"))
		        {		            
		        	i=11;
		        	
		        	//remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		            
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelSubject2 = new JLabel("Subject 2");
		    		tfGrade2 = new JTextField(5);
		    		tfCredit2 = new JTextField(5);
		    		tfValue2 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject2);
		    		subjectsPanel.add(tfGrade2);
		    		subjectsPanel.add(tfCredit2);
		    		subjectsPanel.add(tfValue2);
		    		
		    		JLabel labelSubject3 = new JLabel("Subject 3");
		    		tfGrade3 = new JTextField(5);
		    		tfCredit3 = new JTextField(5);
		    		tfValue3 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject3);
		    		subjectsPanel.add(tfGrade3);
		    		subjectsPanel.add(tfCredit3);
		    		subjectsPanel.add(tfValue3);
		    		
		    		JLabel labelSubject4 = new JLabel("Subject 4");
		    		tfGrade4 = new JTextField(5);
		    		tfCredit4 = new JTextField(5);
		    		tfValue4 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject4);
		    		subjectsPanel.add(tfGrade4);
		    		subjectsPanel.add(tfCredit4);
		    		subjectsPanel.add(tfValue4);
		    		
		    		JLabel labelSubject5 = new JLabel("Subject 5");
		    		tfGrade5 = new JTextField(5);
		    		tfCredit5 = new JTextField(5);
		    		tfValue5 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject5);
		    		subjectsPanel.add(tfGrade5);
		    		subjectsPanel.add(tfCredit5);
		    		subjectsPanel.add(tfValue5);
		    		
		    		JLabel labelSubject6 = new JLabel("Subject 6");
		    		tfGrade6 = new JTextField(5);
		    		tfCredit6 = new JTextField(5);
		    		tfValue6 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject6);
		    		subjectsPanel.add(tfGrade6);
		    		subjectsPanel.add(tfCredit6);
		    		subjectsPanel.add(tfValue6);
		    		
		    		JLabel labelSubject7 = new JLabel("Subject 7");
		    		tfGrade7 = new JTextField(5);
		    		tfCredit7 = new JTextField(5);
		    		tfValue7 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject7);
		    		subjectsPanel.add(tfGrade7);
		    		subjectsPanel.add(tfCredit7);
		    		subjectsPanel.add(tfValue7);
		    		
		    		JLabel labelSubject8 = new JLabel("Subject 8");
		    		tfGrade8 = new JTextField(5);
		    		tfCredit8 = new JTextField(5);
		    		tfValue8 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject8);
		    		subjectsPanel.add(tfGrade8);
		    		subjectsPanel.add(tfCredit8);
		    		subjectsPanel.add(tfValue8);
		    		
		    		JLabel labelSubject9 = new JLabel("Subject 9");
		    		tfGrade9 = new JTextField(5);
		    		tfCredit9 = new JTextField(5);
		    		tfValue9 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject9);
		    		subjectsPanel.add(tfGrade9);
		    		subjectsPanel.add(tfCredit9);
		    		subjectsPanel.add(tfValue9);
		    		
		    		JLabel labelSubject10 = new JLabel("Subject 10");
		    		tfGrade10 = new JTextField(5);
		    		tfCredit10 = new JTextField(5);
		    		tfValue10 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject10);
		    		subjectsPanel.add(tfGrade10);
		    		subjectsPanel.add(tfCredit10);
		    		subjectsPanel.add(tfValue10);
		    		
		    		JLabel labelSubject11 = new JLabel("Subject 11");
		    		tfGrade11 = new JTextField(5);
		    		tfCredit11 = new JTextField(5);
		    		tfValue11 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject11);
		    		subjectsPanel.add(tfGrade11);
		    		subjectsPanel.add(tfCredit11);
		    		subjectsPanel.add(tfValue11);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		    		pack();		
		        }
		        
		        else if (selectedSub.equals("12"))
		        {		            
		        	i=12;
		        	//remove all components in panel.
		            subjectsPanel.removeAll(); 
		            // refresh the panel.
		            subjectsPanel.updateUI();
		            
		            JLabel subject = new JLabel("Subject");
		            JLabel grade = new JLabel("Grade");
		            JLabel credit = new JLabel("Credit");
		            JLabel value = new JLabel("Value");
		    		
		    		subjectsPanel.add(subject);
		    		subjectsPanel.add(grade);
		    		subjectsPanel.add(credit);
		    		subjectsPanel.add(value);
		            
		            JLabel labelSubject1 = new JLabel("Subject 1");
		    		tfGrade1 = new JTextField(5);
		    		tfCredit1 = new JTextField(5);
		    		tfValue1 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject1);
		    		subjectsPanel.add(tfGrade1);
		    		subjectsPanel.add(tfCredit1);
		    		subjectsPanel.add(tfValue1);
		    		
		    		JLabel labelSubject2 = new JLabel("Subject 2");
		    		tfGrade2 = new JTextField(5);
		    		tfCredit2 = new JTextField(5);
		    		tfValue2 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject2);
		    		subjectsPanel.add(tfGrade2);
		    		subjectsPanel.add(tfCredit2);
		    		subjectsPanel.add(tfValue2);
		    		
		    		JLabel labelSubject3 = new JLabel("Subject 3");
		    		tfGrade3 = new JTextField(5);
		    		tfCredit3 = new JTextField(5);
		    		tfValue3 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject3);
		    		subjectsPanel.add(tfGrade3);
		    		subjectsPanel.add(tfCredit3);
		    		subjectsPanel.add(tfValue3);
		    		
		    		JLabel labelSubject4 = new JLabel("Subject 4");
		    		tfGrade4 = new JTextField(5);
		    		tfCredit4 = new JTextField(5);
		    		tfValue4 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject4);
		    		subjectsPanel.add(tfGrade4);
		    		subjectsPanel.add(tfCredit4);
		    		subjectsPanel.add(tfValue4);
		    		
		    		JLabel labelSubject5 = new JLabel("Subject 5");
		    		tfGrade5 = new JTextField(5);
		    		tfCredit5 = new JTextField(5);
		    		tfValue5 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject5);
		    		subjectsPanel.add(tfGrade5);
		    		subjectsPanel.add(tfCredit5);
		    		subjectsPanel.add(tfValue5);
		    		
		    		JLabel labelSubject6 = new JLabel("Subject 6");
		    		tfGrade6 = new JTextField(5);
		    		tfCredit6 = new JTextField(5);
		    		tfValue6 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject6);
		    		subjectsPanel.add(tfGrade6);
		    		subjectsPanel.add(tfCredit6);
		    		subjectsPanel.add(tfValue6);
		    		
		    		JLabel labelSubject7 = new JLabel("Subject 7");
		    		tfGrade7 = new JTextField(5);
		    		tfCredit7 = new JTextField(5);
		    		tfValue7 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject7);
		    		subjectsPanel.add(tfGrade7);
		    		subjectsPanel.add(tfCredit7);
		    		subjectsPanel.add(tfValue7);
		    		
		    		JLabel labelSubject8 = new JLabel("Subject 8");
		    		tfGrade8 = new JTextField(5);
		    		tfCredit8 = new JTextField(5);
		    		tfValue8 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject8);
		    		subjectsPanel.add(tfGrade8);
		    		subjectsPanel.add(tfCredit8);
		    		subjectsPanel.add(tfValue8);
		    		
		    		JLabel labelSubject9 = new JLabel("Subject 9");
		    		tfGrade9 = new JTextField(5);
		    		tfCredit9 = new JTextField(5);
		    		tfValue9 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject9);
		    		subjectsPanel.add(tfGrade9);
		    		subjectsPanel.add(tfCredit9);
		    		subjectsPanel.add(tfValue9);
		    		
		    		JLabel labelSubject10 = new JLabel("Subject 10");
		    		tfGrade10 = new JTextField(5);
		    		tfCredit10 = new JTextField(5);
		    		tfValue10 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject10);
		    		subjectsPanel.add(tfGrade10);
		    		subjectsPanel.add(tfCredit10);
		    		subjectsPanel.add(tfValue10);
		    		
		    		JLabel labelSubject11 = new JLabel("Subject 11");
		    		tfGrade11 = new JTextField(5);
		    		tfCredit11 = new JTextField(5);
		    		tfValue11 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject11);
		    		subjectsPanel.add(tfGrade11);
		    		subjectsPanel.add(tfCredit11);
		    		subjectsPanel.add(tfValue11);
		    		
		    		JLabel labelSubject12 = new JLabel("Subject 12");
		    		tfGrade12 = new JTextField(5);
		    		tfCredit12 = new JTextField(5);
		    		tfValue12 = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelSubject12);
		    		subjectsPanel.add(tfGrade12);
		    		subjectsPanel.add(tfCredit12);
		    		subjectsPanel.add(tfValue12);
		    		
		    		JLabel labelTotal = new JLabel("GPA:");
		    		JLabel tfBlank1 = new JLabel("");
		    		JLabel tfBlank2 = new JLabel("");
		    		tfTotal = new JLabel(" ");
		    		
		    		subjectsPanel.add(labelTotal);
		    		subjectsPanel.add(tfBlank1);
		    		subjectsPanel.add(tfBlank2);
		    		subjectsPanel.add(tfTotal);
		    		pack();		
		        }
		    }
		});
		
		topPanel.add(numberSubjects);
		topPanel.add(numberList);
		contentPane.add(topPanel, BorderLayout.PAGE_START);
		
		subjectsPanel = new JPanel();
		GridLayout experimentLayout = new GridLayout(0,4);
		
		subjectsPanel.setLayout(experimentLayout);
		contentPane.add(subjectsPanel, BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel();
		JButton btSubmit = new JButton("Submit");
		btSubmit.addActionListener(this);
		bottomPanel.add(btSubmit);
		contentPane.add(bottomPanel, BorderLayout.PAGE_END);

		setVisible(true);
		setSize(300,320);
	}
	
	//Instantiates Calculator widow
	public static void main(String [] args)
	{
		new Calculator();
	}

	//Retrieves grades and inserts GPAs
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Gradesbook grades = new Gradesbook();
		
		if(i==1)
		{
			String grade = tfGrade1.getText().toUpperCase();
			checkGrade(grade);
			double gpv = grades.getGrade(grade);
			
			int credit = Integer.parseInt(tfCredit1.getText());
			if (credit>5.00 || credit<0.01)
			{
				JOptionPane.showMessageDialog(null, "Please enter lettered grades only.");
			}
			int totalCredit = credit;
			
			double value = gpv*credit;
			double totalValue = value;
			tfValue1.setText("" + value);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
		
		else if(i==2)
		{
			String grade1 = tfGrade1.getText().toUpperCase();
			checkGrade(grade1);
			double gpv1 = grades.getGrade(grade1);
			
			String grade2 = tfGrade2.getText().toUpperCase();
			checkGrade(grade2);
			double gpv2 = grades.getGrade(grade2);
			
			int credit1 = Integer.parseInt(tfCredit1.getText());
			int credit2 = Integer.parseInt(tfCredit2.getText());
			int totalCredit = credit1 + credit2;
			
			double value1 = gpv1*credit1;
			double value2 = gpv2*credit2;
			double totalValue = value1 + value2;
			
			tfValue1.setText("" + value1);
			tfValue2.setText("" + value2);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
		
		else if(i==3)
		{
			String grade1 = tfGrade1.getText().toUpperCase();
			checkGrade(grade1);
			double gpv1 = grades.getGrade(grade1);
			
			String grade2 = tfGrade2.getText().toUpperCase();
			checkGrade(grade2);
			double gpv2 = grades.getGrade(grade2);
			
			String grade3 = tfGrade3.getText().toUpperCase();
			checkGrade(grade3);
			double gpv3 = grades.getGrade(grade3);
			
			int credit1 = Integer.parseInt(tfCredit1.getText());
			int credit2 = Integer.parseInt(tfCredit2.getText());
			int credit3 = Integer.parseInt(tfCredit3.getText());
			int totalCredit = credit1 + credit2 + credit3;
			
			double value1 = gpv1*credit1;
			double value2 = gpv2*credit2;
			double value3 = gpv3*credit3;
			double totalValue = value1 + value2 + value3;
			
			tfValue1.setText("" + value1);
			tfValue2.setText("" + value2);
			tfValue3.setText("" + value3);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
		
		else if(i==4)
		{
			String grade1 = tfGrade1.getText().toUpperCase();
			checkGrade(grade1);
			double gpv1 = grades.getGrade(grade1);
			
			String grade2 = tfGrade2.getText().toUpperCase();
			checkGrade(grade2);
			double gpv2 = grades.getGrade(grade2);
			
			String grade3 = tfGrade3.getText().toUpperCase();
			checkGrade(grade3);
			double gpv3 = grades.getGrade(grade3);
			
			String grade4 = tfGrade4.getText().toUpperCase();
			checkGrade(grade4);
			double gpv4 = grades.getGrade(grade4);
			
			int credit1 = Integer.parseInt(tfCredit1.getText());
			int credit2 = Integer.parseInt(tfCredit2.getText());
			int credit3 = Integer.parseInt(tfCredit3.getText());
			int credit4 = Integer.parseInt(tfCredit4.getText());
			int totalCredit = credit1 + credit2 + credit3 + credit4;
			
			double value1 = gpv1*credit1;
			double value2 = gpv2*credit2;
			double value3 = gpv3*credit3;
			double value4 = gpv4*credit4;
			double totalValue = value1 + value2 + value3 + value4;
			
			tfValue1.setText("" + value1);
			tfValue2.setText("" + value2);
			tfValue3.setText("" + value3);
			tfValue4.setText("" + value4);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
		
		else if(i==5)
		{
			String grade1 = tfGrade1.getText().toUpperCase();
			checkGrade(grade1);
			double gpv1 = grades.getGrade(grade1);
			
			String grade2 = tfGrade2.getText().toUpperCase();
			checkGrade(grade2);
			double gpv2 = grades.getGrade(grade2);
			
			String grade3 = tfGrade3.getText().toUpperCase();
			checkGrade(grade3);
			double gpv3 = grades.getGrade(grade3);
			
			String grade4 = tfGrade4.getText().toUpperCase();
			checkGrade(grade4);
			double gpv4 = grades.getGrade(grade4);
			
			String grade5 = tfGrade5.getText().toUpperCase();
			checkGrade(grade5);	
			double gpv5 = grades.getGrade(grade5);
			
			int credit1 = Integer.parseInt(tfCredit1.getText());
			int credit2 = Integer.parseInt(tfCredit2.getText());
			int credit3 = Integer.parseInt(tfCredit3.getText());
			int credit4 = Integer.parseInt(tfCredit4.getText());
			int credit5 = Integer.parseInt(tfCredit5.getText());
			int totalCredit = credit1 + credit2 + credit3 + credit4 + credit5;
			
			double value1 = gpv1*credit1;
			double value2 = gpv2*credit2;
			double value3 = gpv3*credit3;
			double value4 = gpv4*credit4;
			double value5 = gpv5*credit5;
			double totalValue = value1 + value2 + value3 + value4 + value5;
			
			tfValue1.setText("" + value1);
			tfValue2.setText("" + value2);
			tfValue3.setText("" + value3);
			tfValue4.setText("" + value4);
			tfValue5.setText("" + value5);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
		
		else if(i==6)
		{
			String grade1 = tfGrade1.getText().toUpperCase();
			checkGrade(grade1);
			double gpv1 = grades.getGrade(grade1);
			
			String grade2 = tfGrade2.getText().toUpperCase();
			checkGrade(grade2);
			double gpv2 = grades.getGrade(grade2);
			
			String grade3 = tfGrade3.getText().toUpperCase();
			checkGrade(grade3);
			double gpv3 = grades.getGrade(grade3);
			
			String grade4 = tfGrade4.getText().toUpperCase();
			checkGrade(grade4);
			double gpv4 = grades.getGrade(grade4);
			
			String grade5 = tfGrade5.getText().toUpperCase();
			checkGrade(grade5);	
			double gpv5 = grades.getGrade(grade5);
			
			String grade6 = tfGrade6.getText().toUpperCase();
			checkGrade(grade6);	
			double gpv6 = grades.getGrade(grade6);
			
			int credit1 = Integer.parseInt(tfCredit1.getText());
			int credit2 = Integer.parseInt(tfCredit2.getText());
			int credit3 = Integer.parseInt(tfCredit3.getText());
			int credit4 = Integer.parseInt(tfCredit4.getText());
			int credit5 = Integer.parseInt(tfCredit5.getText());
			int credit6 = Integer.parseInt(tfCredit6.getText());
			int totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6;
			
			double value1 = gpv1*credit1;
			double value2 = gpv2*credit2;
			double value3 = gpv3*credit3;
			double value4 = gpv4*credit4;
			double value5 = gpv5*credit5;
			double value6 = gpv6*credit6;
			double totalValue = value1 + value2 + value3 + value4 + value5 + value6;
			
			tfValue1.setText("" + value1);
			tfValue2.setText("" + value2);
			tfValue3.setText("" + value3);
			tfValue4.setText("" + value4);
			tfValue5.setText("" + value5);
			tfValue6.setText("" + value6);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
		
		else if(i==7)
		{
			String grade1 = tfGrade1.getText().toUpperCase();
			checkGrade(grade1);
			double gpv1 = grades.getGrade(grade1);
			
			String grade2 = tfGrade2.getText().toUpperCase();
			checkGrade(grade2);
			double gpv2 = grades.getGrade(grade2);
			
			String grade3 = tfGrade3.getText().toUpperCase();
			checkGrade(grade3);
			double gpv3 = grades.getGrade(grade3);
			
			String grade4 = tfGrade4.getText().toUpperCase();
			checkGrade(grade4);
			double gpv4 = grades.getGrade(grade4);
			
			String grade5 = tfGrade5.getText().toUpperCase();
			checkGrade(grade5);	
			double gpv5 = grades.getGrade(grade5);
			
			String grade6 = tfGrade6.getText().toUpperCase();
			checkGrade(grade6);
			double gpv6 = grades.getGrade(grade6);
			
			String grade7 = tfGrade7.getText().toUpperCase();
			checkGrade(grade7);	
			double gpv7 = grades.getGrade(grade7);
			
			int credit1 = Integer.parseInt(tfCredit1.getText());
			int credit2 = Integer.parseInt(tfCredit2.getText());
			int credit3 = Integer.parseInt(tfCredit3.getText());
			int credit4 = Integer.parseInt(tfCredit4.getText());
			int credit5 = Integer.parseInt(tfCredit5.getText());
			int credit6 = Integer.parseInt(tfCredit6.getText());
			int credit7 = Integer.parseInt(tfCredit7.getText());
			int totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7;
			
			double value1 = gpv1*credit1;
			double value2 = gpv2*credit2;
			double value3 = gpv3*credit3;
			double value4 = gpv4*credit4;
			double value5 = gpv5*credit5;
			double value6 = gpv6*credit6;
			double value7 = gpv7*credit7;
			double totalValue = value1 + value2 + value3 + value4 + value5 + value6 + value7;
			
			tfValue1.setText("" + value1);
			tfValue2.setText("" + value2);
			tfValue3.setText("" + value3);
			tfValue4.setText("" + value4);
			tfValue5.setText("" + value5);
			tfValue6.setText("" + value6);
			tfValue7.setText("" + value7);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
		
		else if(i==8)
		{
			String grade1 = tfGrade1.getText().toUpperCase();
			checkGrade(grade1);	
			double gpv1 = grades.getGrade(grade1);
			
			String grade2 = tfGrade2.getText().toUpperCase();
			checkGrade(grade2);
			double gpv2 = grades.getGrade(grade2);
			
			String grade3 = tfGrade3.getText().toUpperCase();
			checkGrade(grade3);
			double gpv3 = grades.getGrade(grade3);
			
			String grade4 = tfGrade4.getText().toUpperCase();
			checkGrade(grade4);
			double gpv4 = grades.getGrade(grade4);
			
			String grade5 = tfGrade5.getText().toUpperCase();
			checkGrade(grade5);
			double gpv5 = grades.getGrade(grade5);
			
			String grade6 = tfGrade6.getText().toUpperCase();
			checkGrade(grade6);	
			double gpv6 = grades.getGrade(grade6);
			
			String grade7 = tfGrade7.getText().toUpperCase();
			checkGrade(grade7);
			double gpv7 = grades.getGrade(grade7);
			
			String grade8 = tfGrade8.getText().toUpperCase();
			checkGrade(grade8);
			double gpv8 = grades.getGrade(grade8);
			
			int credit1 = Integer.parseInt(tfCredit1.getText());
			int credit2 = Integer.parseInt(tfCredit2.getText());
			int credit3 = Integer.parseInt(tfCredit3.getText());
			int credit4 = Integer.parseInt(tfCredit4.getText());
			int credit5 = Integer.parseInt(tfCredit5.getText());
			int credit6 = Integer.parseInt(tfCredit6.getText());
			int credit7 = Integer.parseInt(tfCredit7.getText());
			int credit8 = Integer.parseInt(tfCredit8.getText());
			int totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8;
			
			double value1 = gpv1*credit1;
			double value2 = gpv2*credit2;
			double value3 = gpv3*credit3;
			double value4 = gpv4*credit4;
			double value5 = gpv5*credit5;
			double value6 = gpv6*credit6;
			double value7 = gpv7*credit7;
			double value8 = gpv8*credit8;
			double totalValue = value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8;
			
			tfValue1.setText("" + value1);
			tfValue2.setText("" + value2);
			tfValue3.setText("" + value3);
			tfValue4.setText("" + value4);
			tfValue5.setText("" + value5);
			tfValue6.setText("" + value6);
			tfValue7.setText("" + value7);
			tfValue8.setText("" + value8);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
		
		else if(i==9)
		{
			String grade1 = tfGrade1.getText().toUpperCase();
			checkGrade(grade1);
			double gpv1 = grades.getGrade(grade1);
			
			String grade2 = tfGrade2.getText().toUpperCase();
			checkGrade(grade2);	
			double gpv2 = grades.getGrade(grade2);
			
			String grade3 = tfGrade3.getText().toUpperCase();
			checkGrade(grade3);	
			double gpv3 = grades.getGrade(grade3);
			
			String grade4 = tfGrade4.getText().toUpperCase();
			checkGrade(grade4);
			double gpv4 = grades.getGrade(grade4);
			
			String grade5 = tfGrade5.getText().toUpperCase();
			checkGrade(grade5);
			double gpv5 = grades.getGrade(grade5);
			
			String grade6 = tfGrade6.getText().toUpperCase();
			checkGrade(grade6);
			double gpv6 = grades.getGrade(grade6);
			
			String grade7 = tfGrade7.getText().toUpperCase();
			checkGrade(grade7);
			double gpv7 = grades.getGrade(grade7);
			
			String grade8 = tfGrade8.getText().toUpperCase();
			checkGrade(grade8);
			double gpv8 = grades.getGrade(grade8);
			
			String grade9 = tfGrade9.getText().toUpperCase();
			checkGrade(grade9);
			double gpv9 = grades.getGrade(grade9);
			
			int credit1 = Integer.parseInt(tfCredit1.getText());
			int credit2 = Integer.parseInt(tfCredit2.getText());
			int credit3 = Integer.parseInt(tfCredit3.getText());
			int credit4 = Integer.parseInt(tfCredit4.getText());
			int credit5 = Integer.parseInt(tfCredit5.getText());
			int credit6 = Integer.parseInt(tfCredit6.getText());
			int credit7 = Integer.parseInt(tfCredit7.getText());
			int credit8 = Integer.parseInt(tfCredit8.getText());
			int credit9 = Integer.parseInt(tfCredit9.getText());
			int totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9;
			
			double value1 = gpv1*credit1;
			double value2 = gpv2*credit2;
			double value3 = gpv3*credit3;
			double value4 = gpv4*credit4;
			double value5 = gpv5*credit5;
			double value6 = gpv6*credit6;
			double value7 = gpv7*credit7;
			double value8 = gpv8*credit8;
			double value9 = gpv9*credit9;
			double totalValue = value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8 + value9;
			
			tfValue1.setText("" + value1);
			tfValue2.setText("" + value2);
			tfValue3.setText("" + value3);
			tfValue4.setText("" + value4);
			tfValue5.setText("" + value5);
			tfValue6.setText("" + value6);
			tfValue7.setText("" + value7);
			tfValue8.setText("" + value8);
			tfValue9.setText("" + value9);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
		
		else if(i==10)
		{
			String grade1 = tfGrade1.getText().toUpperCase();
			checkGrade(grade1);
			double gpv1 = grades.getGrade(grade1);
			
			String grade2 = tfGrade2.getText().toUpperCase();
			checkGrade(grade2);
			double gpv2 = grades.getGrade(grade2);
			
			String grade3 = tfGrade3.getText().toUpperCase();
			checkGrade(grade3);	
			double gpv3 = grades.getGrade(grade3);
			
			String grade4 = tfGrade4.getText().toUpperCase();
			checkGrade(grade4);	
			double gpv4 = grades.getGrade(grade4);
			
			String grade5 = tfGrade5.getText().toUpperCase();
			checkGrade(grade5);
			double gpv5 = grades.getGrade(grade5);
			
			String grade6 = tfGrade6.getText().toUpperCase();
			checkGrade(grade6);	
			double gpv6 = grades.getGrade(grade6);
			
			String grade7 = tfGrade7.getText().toUpperCase();
			checkGrade(grade7);
			double gpv7 = grades.getGrade(grade7);
			
			String grade8 = tfGrade8.getText().toUpperCase();
			checkGrade(grade8);
			double gpv8 = grades.getGrade(grade8);
			
			String grade9 = tfGrade9.getText().toUpperCase();
			checkGrade(grade9);
			double gpv9 = grades.getGrade(grade9);
			
			String grade10 = tfGrade10.getText().toUpperCase();
			checkGrade(grade10);	
			double gpv10 = grades.getGrade(grade10);
			
			int credit1 = Integer.parseInt(tfCredit1.getText());
			int credit2 = Integer.parseInt(tfCredit2.getText());
			int credit3 = Integer.parseInt(tfCredit3.getText());
			int credit4 = Integer.parseInt(tfCredit4.getText());
			int credit5 = Integer.parseInt(tfCredit5.getText());
			int credit6 = Integer.parseInt(tfCredit6.getText());
			int credit7 = Integer.parseInt(tfCredit7.getText());
			int credit8 = Integer.parseInt(tfCredit8.getText());
			int credit9 = Integer.parseInt(tfCredit9.getText());
			int credit10 = Integer.parseInt(tfCredit10.getText());
			int totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10;
			
			double value1 = gpv1*credit1;
			double value2 = gpv2*credit2;
			double value3 = gpv3*credit3;
			double value4 = gpv4*credit4;
			double value5 = gpv5*credit5;
			double value6 = gpv6*credit6;
			double value7 = gpv7*credit7;
			double value8 = gpv8*credit8;
			double value9 = gpv9*credit9;
			double value10 = gpv10*credit10;
			double totalValue = value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8 + value9 + value10;
			
			tfValue1.setText("" + value1);
			tfValue2.setText("" + value2);
			tfValue3.setText("" + value3);
			tfValue4.setText("" + value4);
			tfValue5.setText("" + value5);
			tfValue6.setText("" + value6);
			tfValue7.setText("" + value7);
			tfValue8.setText("" + value8);
			tfValue9.setText("" + value9);
			tfValue10.setText("" + value10);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
		
		else if(i==11)
		{
			String grade1 = tfGrade1.getText().toUpperCase();
			checkGrade(grade1);
			double gpv1 = grades.getGrade(grade1);
			
			String grade2 = tfGrade2.getText().toUpperCase();
			checkGrade(grade2);
			double gpv2 = grades.getGrade(grade2);
			
			String grade3 = tfGrade3.getText().toUpperCase();
			checkGrade(grade3);
			double gpv3 = grades.getGrade(grade3);
			
			String grade4 = tfGrade4.getText().toUpperCase();
			checkGrade(grade4);	
			double gpv4 = grades.getGrade(grade4);
			
			String grade5 = tfGrade5.getText().toUpperCase();
			checkGrade(grade5);
			double gpv5 = grades.getGrade(grade5);
			
			String grade6 = tfGrade6.getText().toUpperCase();
			checkGrade(grade6);
			double gpv6 = grades.getGrade(grade6);
			
			String grade7 = tfGrade7.getText().toUpperCase();
			checkGrade(grade7);
			double gpv7 = grades.getGrade(grade7);
			
			String grade8 = tfGrade8.getText().toUpperCase();
			checkGrade(grade8);
			double gpv8 = grades.getGrade(grade8);
			
			String grade9 = tfGrade9.getText().toUpperCase();
			checkGrade(grade9);
			double gpv9 = grades.getGrade(grade9);
			
			String grade10 = tfGrade10.getText().toUpperCase();
			checkGrade(grade10);	
			double gpv10 = grades.getGrade(grade10);
			
			String grade11 = tfGrade11.getText().toUpperCase();
			checkGrade(grade11);
			double gpv11 = grades.getGrade(grade11);
			
			int credit1 = Integer.parseInt(tfCredit1.getText());
			int credit2 = Integer.parseInt(tfCredit2.getText());
			int credit3 = Integer.parseInt(tfCredit3.getText());
			int credit4 = Integer.parseInt(tfCredit4.getText());
			int credit5 = Integer.parseInt(tfCredit5.getText());
			int credit6 = Integer.parseInt(tfCredit6.getText());
			int credit7 = Integer.parseInt(tfCredit7.getText());
			int credit8 = Integer.parseInt(tfCredit8.getText());
			int credit9 = Integer.parseInt(tfCredit9.getText());
			int credit10 = Integer.parseInt(tfCredit10.getText());
			int credit11 = Integer.parseInt(tfCredit11.getText());
			int totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 + credit11;
			
			double value1 = gpv1*credit1;
			double value2 = gpv2*credit2;
			double value3 = gpv3*credit3;
			double value4 = gpv4*credit4;
			double value5 = gpv5*credit5;
			double value6 = gpv6*credit6;
			double value7 = gpv7*credit7;
			double value8 = gpv8*credit8;
			double value9 = gpv9*credit9;
			double value10 = gpv10*credit10;
			double value11 = gpv11*credit11;
			double totalValue = value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8 + value9 + value10 + value11;
			
			tfValue1.setText("" + value1);
			tfValue2.setText("" + value2);
			tfValue3.setText("" + value3);
			tfValue4.setText("" + value4);
			tfValue5.setText("" + value5);
			tfValue6.setText("" + value6);
			tfValue7.setText("" + value7);
			tfValue8.setText("" + value8);
			tfValue9.setText("" + value9);
			tfValue10.setText("" + value10);
			tfValue11.setText("" + value11);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
		
		else if(i==12)
		{
			String grade1 = tfGrade1.getText().toUpperCase();
			checkGrade(grade1);
			double gpv1 = grades.getGrade(grade1);
			
			String grade2 = tfGrade2.getText().toUpperCase();
			checkGrade(grade2);
			double gpv2 = grades.getGrade(grade2);
			
			String grade3 = tfGrade3.getText().toUpperCase();
			checkGrade(grade3);
			double gpv3 = grades.getGrade(grade3);
			
			String grade4 = tfGrade4.getText().toUpperCase();
			checkGrade(grade4);
			double gpv4 = grades.getGrade(grade4);
			
			String grade5 = tfGrade5.getText().toUpperCase();
			checkGrade(grade5);	
			double gpv5 = grades.getGrade(grade5);
			
			String grade6 = tfGrade6.getText().toUpperCase();
			checkGrade(grade6);
			double gpv6 = grades.getGrade(grade6);
			
			String grade7 = tfGrade7.getText().toUpperCase();
			checkGrade(grade7);
			double gpv7 = grades.getGrade(grade7);
			
			String grade8 = tfGrade8.getText().toUpperCase();
			checkGrade(grade8);
			double gpv8 = grades.getGrade(grade8);
			
			String grade9 = tfGrade9.getText().toUpperCase();
			checkGrade(grade9);
			double gpv9 = grades.getGrade(grade9);
			
			String grade10 = tfGrade10.getText().toUpperCase();
			checkGrade(grade10);	
			double gpv10 = grades.getGrade(grade10);
			
			String grade11 = tfGrade11.getText().toUpperCase();
			checkGrade(grade11);	
			double gpv11 = grades.getGrade(grade11);
			
			String grade12 = tfGrade12.getText().toUpperCase();
			checkGrade(grade12);
			double gpv12 = grades.getGrade(grade12);
			
			int credit1 = Integer.parseInt(tfCredit1.getText());
			int credit2 = Integer.parseInt(tfCredit2.getText());
			int credit3 = Integer.parseInt(tfCredit3.getText());
			int credit4 = Integer.parseInt(tfCredit4.getText());
			int credit5 = Integer.parseInt(tfCredit5.getText());
			int credit6 = Integer.parseInt(tfCredit6.getText());
			int credit7 = Integer.parseInt(tfCredit7.getText());
			int credit8 = Integer.parseInt(tfCredit8.getText());
			int credit9 = Integer.parseInt(tfCredit9.getText());
			int credit10 = Integer.parseInt(tfCredit10.getText());
			int credit11 = Integer.parseInt(tfCredit11.getText());
			int credit12 = Integer.parseInt(tfCredit12.getText());
			int totalCredit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 + credit11 + credit12;
			
			double value1 = gpv1*credit1;
			double value2 = gpv2*credit2;
			double value3 = gpv3*credit3;
			double value4 = gpv4*credit4;
			double value5 = gpv5*credit5;
			double value6 = gpv6*credit6;
			double value7 = gpv7*credit7;
			double value8 = gpv8*credit8;
			double value9 = gpv9*credit9;
			double value10 = gpv10*credit10;
			double value11 = gpv11*credit11;
			double value12 = gpv12*credit12;
			double totalValue = value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8 + value9 + value10 + value11 + value12;
			
			tfValue1.setText("" + value1);
			tfValue2.setText("" + value2);
			tfValue3.setText("" + value3);
			tfValue4.setText("" + value4);
			tfValue5.setText("" + value5);
			tfValue6.setText("" + value6);
			tfValue7.setText("" + value7);
			tfValue8.setText("" + value8);
			tfValue9.setText("" + value9);
			tfValue10.setText("" + value10);
			tfValue11.setText("" + value11);
			tfValue12.setText("" + value12);
			
			double gpa = totalValue/totalCredit;
			tfTotal.setText("" + gpa);
		}
	}

	private void checkGrade(String grade) 
	{
		boolean valid;
		if (grade == null)
			valid = false;
		else if(grade.equals("A"))
			valid = true;
		else if(grade.equals("B+"))
			valid = true;
		else if(grade.equals("B"))
			valid = true;
		else if(grade.equals("B-"))
			valid = true;
		else if(grade.equals("C+"))
			valid = true;
		else if(grade.equals("C"))
			valid = true;
		else if(grade.equals("D"))
			valid = true;
		else if(grade.equals("F"))
			valid = true;
		else if(grade.equals("G"))
			valid = true;
		else
			valid = false;
		
		if(!valid)
		{
			JOptionPane.showMessageDialog(null, "Please enter a supported grade such as A, B+, B etc.", "Unsupported Grade.", JOptionPane.WARNING_MESSAGE);
		}
	}
}