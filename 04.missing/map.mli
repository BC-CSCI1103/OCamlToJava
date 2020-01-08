type 'a t
type key

val isEmpty : 'a t -> bool
val get : key -> 'a t -> 'a option
val put : key -> 'a -> 'a t -> 'a t
