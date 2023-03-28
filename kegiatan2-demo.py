# author = Alvin Suwarno Putra

class Node:
    def __init__(self, data=None):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return
        current_node = self.head
        while current_node.next is not None:
            current_node = current_node.next
        current_node.next = new_node

    def len(self):
        count = 0
        node = self.head
        while node:
            count += 1
            node = node.next
        return count

    def bubble_sort(self):
        if self.head is None or self.head.next is None:
            return
        swapped = True
        while swapped:
            swapped = False
            prev_node = None
            current_node = self.head
            while current_node.next is not None:
                next_node = current_node.next
                if current_node.data > next_node.data:
                    current_node.next = next_node.next
                    next_node.next = current_node
                    if prev_node is None:
                        self.head = next_node
                    else:
                        prev_node.next = next_node
                    prev_node = next_node
                    swapped = True
                else:
                    prev_node = current_node
                    current_node = next_node

    def print_list(self):
        current_node = self.head
        while current_node is not None:
            print(current_node.data, end=' ')
            current_node = current_node.next
        print()


linkedList = LinkedList()
linkedList.append(7)
linkedList.append(1)
linkedList.append(4)
linkedList.append(6)
linkedList.append(2)
linkedList.append(3)

print('before')
linkedList.print_list()

linkedList.append(8)
linkedList.bubble_sort()
print('after')
linkedList.print_list()
