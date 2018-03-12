package org.dusan.dlist

trait DList[+T] {
  def isEmpty: Boolean
  def value: T
  def next: DList[T]
  def add[S >: T](elem: S): DList[S]
}
