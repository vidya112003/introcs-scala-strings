Lab: String Operations
======================

Goals for this lab:
-------------------

1.  Explore some of the properties of the pre-defined String class.
2.  Write conditional statements.
3.  Think about problem solving.

This lab depends on the introductory material earlier in this chapter,
particularly `s.length`.


Design, compile and run a single Scala object (with functions) 
to accomplish all of the following tasks. Add one part at a time and 
test using `sbt test` before trying the next one. 


1.  Read a string from the keyboard and print the length of the string,
    with a label.

2.  Read a sentence (string) from a line of input, and print whether it
    represents a *declarative* sentence (i.e. ending in a period),
    *interrogatory* sentence (ending in a question mark), or an
    *exclamation* (ending in exclamation point) or is not a sentence
    (anything else).

    This may be the first time you write a conditional statement. (This
    needs the next chapter.) It makes sense to only make small changes
    at once and build up to final code. First you might just code it to
    check if a sentence is declarative or not. Then remember you can
    test further cases with `else if (...)`.

3.  Read a whole name from a line of input. Assume first and last names
    are separated by a space (no middle name). Print last name first
    followed by a comma and a space, followed by the first name. For
    example, if the input is `"Marcel Proust"`, the output is
    `"Proust, Marcel"`.

4.  Improve the previous part, so it also allows a single name without
    spaces, like "Socrates", and prints the original without change. If
    there are two parts of the name, it should work as in the original
    version. 

Run the program (with parts 1, 2 and 4 active) from a terminal window
and show your TA when you are done. You should run it twice to show off
both paths through part 4. Alternately have the main program just call
part 4 twice!

