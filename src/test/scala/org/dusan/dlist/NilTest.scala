package org.dusan.dlist

import org.scalatest.FlatSpec

class NilTest extends FlatSpec {
  "A Nil" should "be empty" in {
    assert((Nil isEmpty) === true)
  }

  "A Nil" should "throw exception on value" in {
    assertThrows[NoSuchElementException] {
      Nil value
    }
  }

  "A Nil" should "throw exception on next" in {
    assertThrows[UnsupportedOperationException] {
      Nil next
    }
  }

  "A Nil" should "print empty string" in {
    assert((Nil toString) === "[]")
  }

  "A Nil" should "not add Nil List" in {
    assert((Nil add Nil) === Nil)
  }

  "A Nil" should "add value and create LinkedList" in {
    val actual :DList[Int] = Nil.add(5)
    assert((actual value) === 5)
    assert((actual next) === Nil)
  }
}
