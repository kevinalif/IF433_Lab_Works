package oop_111394_KevinAlif.Week7

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Menghadapi monster: ${event.monsterName}!")
        is BattleState.LootDropped -> println("Mendapatkan loot: ${event.item.name} (Rarity: ${event.item.rarity})")
        is BattleState.GameOver -> println("Game Over! Alasan: ${event.reason}")
        BattleState.SafeZone -> println("Kamu berada di Safe Zone yang damai.")
    }
}