(* file: hello4.ml
   author: Bob Muller

   CSCI 1103 Computer Science 1 Honors

   This is OCaml code showing how Java objects can be understood as
   records. This code is explicitly typed in the spirit of Java.
*)
type hello = { first : string
             ; last  : string
             ; sayHello : hello -> unit     (* NB: a recursive type *)
             }

let sayHello (this : hello) : unit =
  let greeting : string = Printf.sprintf "Hello %s %s!" this.first this.last
  in
  print_endline greeting

(* newHello : string -> string -> hello      a -constructor- of hellos
*)
let newHello (first : string) (last : string) : hello =
  { first; last; sayHello }

let main (args : string array) : unit =
  if (Array.length args = 3) then
    let greeter1 : hello = newHello args.(1) args.(2) in
    let greeter2 : hello = newHello args.(2) args.(1)
    in
    greeter1.sayHello(greeter1);
    greeter2.sayHello(greeter2)
  else
    print_endline "Hello World!"

let _ = main Sys.argv
