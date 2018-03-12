package org.dusan.dlist

import java.util.NoSuchElementException

object Nil extends DList[Nothing] {
  override def isEmpty: Boolean = true
  override def value: Nothing = throw new NoSuchElementException
  override def next: DList[Nothing] = throw new UnsupportedOperationException
  override def add[T](elem: T): DList[T] = {
    if(elem == Nil) Nil
    else new LinkedList(elem, Nil)
  }
  override def toString: String = "[]"
}
