# 프로토 패턴 (protoype patterm)

* `생산 비용이 높은 인스턴스` 를 복사를 통해서 쉽게 생성 할 수 있도록 하는 패턴

## 인스턴스 생산 비용이 높은 경우

* `종류가 너무 많아`서 클래스로 정리 되지 않는 경우
* 클래스로 부터 인스턴스 `생성이 어려운 경우`

## 기본 설계

<img width="335" alt="스크린샷 2022-03-12 오후 6 48 46" src="https://user-images.githubusercontent.com/53357210/158013177-a3b91f5a-25b6-479e-94af-119fc2842b43.png">

## 요구 사항

* 일러스트레이터 와 같은 그림 그리기 툴을 개발 중이다.
* 어떤 모양을 그릴 수 있도록 하고 복사 붙여 넣기 기능을 구현 해주세요.

## 추가 요구 사항

* 복사 붙여 넣기 시 기존도형 과 겹치지 않게 해주세요.
