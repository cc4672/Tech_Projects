from tkinter import *

root=Tk()

root.title("BMI Calculator")

def calc_BMI():
    height=float(enter_height.get())
    weight=float(enter_weight.get())
    BMI=weight/(height**2)
    BMI_str = "Your BMI is: "+ str(round(BMI,2)) # Format to 2 decimal places
    bmi.config(text=BMI_str)  # Update label with BMI message
    if BMI<18.5:
        range.config(text="Underweight")
    elif BMI>=18.5 and BMI<25:
        range.config(text="Optimal")
    elif range>=25 and BMI<30:
        range.config(text="Overweight")
    else:
        range.config(text="Obese")

height_label=Label(root,text="Enter height(m):")
height_label.pack()

enter_height=Entry(root)
enter_height.pack()

weight_label=Label(root,text="Enter weight(kg):")
weight_label.pack()

enter_weight=Entry(root)
enter_weight.pack()


      
        
check_button=Button(root, text="Calculate BMI", command=calc_BMI)
check_button.pack()                 
    
bmi=Label(root,text="")
bmi.pack()

range=Label(root, text="")
range.pack()

root.mainloop()