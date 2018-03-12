package org.dusan.dlist

import org.scalatest.FlatSpec

class LinkedListTest extends FlatSpec {
  "A LinkedList" should "not be empty" in {
    val actual :DList[Int] = Nil.add(2)
    assert((actual isEmpty) === false)
  }

  "A LinkedList" should "have 3 elements after adding" in {
    val actual :DList[Int] = Nil.add(2).add(3).add(4)
    assert((actual value) === 4)
    assert(((actual next) value) === 3)
    assert((((actual next) next) value) === 2)
  }

  "A LinkedList" should "have been created from existing list" in {
    val list1 :DList[Int] = Nil.add(2).add(3).add(4)
    var actual :DList[Int] = new LinkedList[Int](5, list1)
    assert((actual value) === 5)
    assert(((actual next) value) === 4)
    assert((((actual next) next) value) === 3)
    assert(((((actual next) next) next) value) === 2)
  }

  "A LinkedList" should "have 1 element displayed on toString" in {
    val actual :DList[Int] = Nil.add(2)
    assert((actual toString) === "[2]")
  }

  "A LinkedList" should "have 2 element displayed on toString" in {
    val actual :DList[Int] = Nil.add(2).add(3)
    assert((actual toString) === "[3, 2]")
  }

  "A LinkedList" should "have 3 element displayed on toString" in {
    val actual :DList[Int] = Nil.add(2).add(3).add(4)
    assert((actual toString) === "[4, 3, 2]")
  }

}
