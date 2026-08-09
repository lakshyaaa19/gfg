class Solution {
    public int minCost(String s, String t, char[][] transform, int[] cost) {
        // code here
        
        int INF = 1000000000;
        
        
        int[][] dist = new int[26][26];

        
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (i == j) {
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = INF;
                }
            }
        }

        
        for (int i = 0; i < transform.length; i++) {
            int u = transform[i][0] - 'a';
            int v = transform[i][1] - 'a';

            
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }

        
        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(
                            dist[i][j],
                            dist[i][k] + dist[k][j]
                        );
                    }
                }
            }
        }

        int ans = 0;

        
        for (int i = 0; i < s.length(); i++) {
            
            int a = s.charAt(i) - 'a';
            int b = t.charAt(i) - 'a';

            
            if (a == b) {
                continue;
            }

            int minCost = INF;

            
            for (int k = 0; k < 26; k++) {
                if (dist[a][k] != INF && dist[b][k] != INF) {
                    minCost = Math.min(
                        minCost,
                        dist[a][k] + dist[b][k]
                    );
                }
            }

            
            if (minCost == INF) {
                return -1;
            }

            ans += minCost;
        }

        return ans;
    
    }
}