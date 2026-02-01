class Solution:
    def minimumCost(self, A: List[int]) -> int:
        α, β = 51, 51

        for i in range(1, len(A)):
            β = min(β, A[i])
            if β < α:
                α, β = β, α
            if α == 1 and β == 1:
                return A[0] + 2;

        return A[0] + α + β
