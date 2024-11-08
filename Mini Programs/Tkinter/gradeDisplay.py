from tkinter import *

root=Tk()
root.title("Simple Grade Displayer")

def grade():
    grade_value=value.get()
    if grade_value=="A":
        value.delete(0,END)
        number_grade.config(text="4.0")
    elif grade_value=="B":
        value.delete(0,END)
        number_grade.config(text="3.0")
    elif grade_value=="C":
        value.delete(0,END)
        number_grade.config(text="2.0")
    elif grade_value=="D":
        value.delete(0,END)
        number_grade.config(text="1.0")
    else:
        value.delete(0,END)
        number_grade.config(text="0.0")
        
        
message=Label(root,text="Enter your grade (A/B/C/D/F)") 
message.pack(pady=2)

value=Entry(root)
value.pack(pady=3)

show=Button(root, text="Submit", command=grade)
show.pack(pady=10)

number_grade=Label(root,text="")
number_grade.pack()





root.mainloop()