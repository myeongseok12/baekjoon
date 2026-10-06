# 🤖 AI 분석

## 💡 접근 방식

뒤에서부터 가격들을 탐색하며 현재 최대 가격보다 낮은 값에서의 이익을 계산하는 방법으로, 최적의 매매가를 찾음.

## ⏱️ 시간 복잡도

O(N) — 각 테스트 케이스에서 N개의 가격을 한 번의 순회로 처리하므로 선형 시간 복잡도.

## 📦 공간 복잡도

O(N) — 입력 데이터(가격 리스트)를 저장하기 위한 배열이 필요하므로, 입력 크기 N에 비례하는 공간 사용.

## 🔧 개선 사항

1) 입력 배열을 사용하지 않고, 일회성 변수로 가격을 저장해 공간 복잡도를 O(1)로 줄이기.
2) 배열의 마지막 요소부터 시작하여 최대값을 지속적으로 갱신하며 계산하도록 개선.
3) Scanner 대신 BufferedReader를 사용하여 입출력을 최적화할 수 있음.
예시: BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

## 🎯 다음 추천 문제

SWEA 1860번 - 진짜 퍼즐 | 다음 단계로, 이익을 최대화하기 위한 전략 수립의 사고 과정을 연습.

## 🏷️ 태그

greedy, implementation

## ✨ 모범 답안

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            long ans = 0;
            int max = 0;

            for (int i = 0; i < N; i++) {
                int price = Integer.parseInt(br.readLine());
                if (price < max) {
                    ans += max - price;
                } else {
                    max = price;
                }
            }
            System.out.println("#" + test_case + " " + ans);
        }
    }
}
```
