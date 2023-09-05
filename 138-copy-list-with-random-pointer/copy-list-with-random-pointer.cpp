/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        unordered_map<Node*,Node*> map;

        Node* itr = head;
        while(itr) {
            map[itr] = new Node(itr->val);
            itr=itr->next;
        }

        itr = head;
        while(itr) {
            map[itr]->next = map[itr->next];
            map[itr]->random = map[itr->random];
            itr = itr->next;
        }

        return map[head];
    }
};