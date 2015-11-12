# 確認内容：
# 	・標準出力への出力
# 	・メソッド戻り値（Boolean）
# 引数：
# 	[0] String
Feature: テストサンプル用シナリオ１

Background:
	Given "jp.picklesjar.example.ut.ProductClass1"クラスのインスタンス生成
		And "getMessage()"を実行対象に指定

Scenario: メッセージ取得テスト
	When 実行対象の処理を実行（パラメータ：なし）
	Then 期待値（"こんにちは"）と合致するかを確認する
