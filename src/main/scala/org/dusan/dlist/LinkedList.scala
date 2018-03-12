package org.dusan.dlist

class LinkedList[T](val value: T, val next: DList[T]) extends DList[T] {
  override def isEmpty: Boolean = false
  override def add[S >: T](elem: S): DList[S] = new LinkedList[S](elem, this)
  override def toString: String = {
    def enumerateAll(list: DList[T]): String = {
      if (list.isEmpty) ""
      else list.value + ", " + enumerateAll(list.next)
    }
    "[" + enumerateAll(this) + "]"
  }
}
