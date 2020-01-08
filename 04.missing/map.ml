(* file: bst.ml
 * author: Bob Muller
 *
 * CS1101 Computer Science I
 *
 * Binary Search Trees
 *
 * Dictionaries (aka maps) associate keys with values. In our examples
 * we'll use strings for keys.
*)
type key = string

type 'a t = Empty
          | Node of { key   : key
                    ; value : 'a
                    ; left  : 'a t
                    ; right : 'a t
                    }

let isEmpty map = match map with | Empty -> true | _ -> false

let rec put key value map =
  match map with
  | Empty -> Node { key
                  ; value
                  ; left  = Empty
                  ; right = Empty
                  }
  | Node {key = key'; value = value'; left; right} ->
    let result = compare key key'
    in
    match result with
    |  0 -> Node { key   = key'
                 ; value = value'
                 ; left
                 ; right
                 }
    | -1 -> Node { key   = key'
                 ; value = value'
                 ; left  = put key value left
                 ; right
                 }
    |  1 -> Node { key   = key'
                 ; value = value'
                 ; left
                 ; right = put key value right
                 }
    |  _ -> failwith "Can't happen"

let rec get key map =
  match map with
  | Empty -> None
  | Node {key = key'; value; left; right} ->
    let result = compare key key'
    in
    (match result with
     |  0 -> Some value
     | -1 -> get key left
     |  1 -> get key right
     |  _ -> failwith "cannot happen")
