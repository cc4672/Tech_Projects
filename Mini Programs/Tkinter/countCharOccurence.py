from tkinter import *

root=Tk()

counting={}

def count_occurrences():
    user_input=message.get()
    
    for each in user_input:
        if each in counting:
            counting[each]+=1
        else:
            counting[each]=1
    # Format dictionary as a string for display
    result = "; ".join(f"{k}: {v}" for k, v in counting.items())
    output.config(text=result)
        
    
intro=Label(root,text="Enter a message:")
intro.pack(pady=2)

message=Entry(root)
message.pack(pady=5)

button=Button(root,text="Count Occurrences", command=count_occurrences)
button.pack(pady=5)

output=Label(root, text="")
output.pack()

root.mainloop()






