# 確認内容：
# 	・標準出力への出力
# 	・メソッド戻り値（Boolean）
# 引数：
# 	[0] String
Feature: テストサンプル用シナリオ１

Background:
	Given "jp.picklesjar.example.ut.ProductClass1"インスタンス生成
		And "getMessage"メソッドをテスト対象に指定

Scenario: メッセージ取得テスト
	When メソッド実行（パラメータ：なし）
	Then 戻り値："こんにちは"
