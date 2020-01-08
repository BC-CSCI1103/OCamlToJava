let main (args : string array) =
  if (Array.length args = 3) then
    let greeting : string = Printf.sprintf "Hello %s %s!" args.(1) args.(2)
    in
    print_endline greeting
  else
    print_endline "Hello World!"

let _ = main Sys.argv























(*
let main args =
  if Array.length args = 3 then
    let greeting = Printf.sprintf "Hello %s %s!" args.(1) args.(2)
    in
    print_endline greeting
  else
    print_endline "Hello World!"

let _ = main Sys.argv
*)
