# jwp-subway-path

## 기능목록

- [ ] 노선에 역 등록 API 신규 구현
  - [ ] (POST /section) 구역에 새로운 역 추가하는 기능
    - [ ] 검증
      - [ ] 라인이 존재하는지 확인
      - [ ] 구역 테이블에 해당 라인의 기준역이 존재하는지 확인
      - [ ] 새로운 역이 존재하는지 확인
    - [ ] 기준역이 종점인지 확인
      - [ ] 새로운 역이 종점이 되는 방향인지 확인?
        - 종점일 경우
          - [ ] 새로운 역을 구역 추가
        - 종점이 아닐 경우
          - [ ] 거리 정보 관리
            - [ ] 해당 방향에 존재하는 구역 거리가 입력 거리보다 큰지 확인
          - [ ] 갈래길 방지
            - [ ] 기존 구역 삭제
            - [x] 기준역과 새로운역으로 구역 추가
            - [ ] 기준역과 연결되어 있었던 역과 새로운 역으로 구역 추가
- [ ] 노선에 역 제거 API 신규 구현
- [ ] 노선 조회 API 수정
- [ ] 노선에 포함된 역을 순서대로 보여주도록 응답을 개선합니다.