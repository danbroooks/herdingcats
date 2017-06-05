
// object Functor {
//   trait Ops[F[_], A] {
//     def typeClassInstance: Functor[F]
//     def self: F[A]
//     def map[B](f: A => B): F[B] = typeClassInstance.map(self)(f)
//   }
// }
