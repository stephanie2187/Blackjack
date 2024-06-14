# Blackjack:
A blackjack simulator- includes the abstract blackjack player class (an abstract superclass which defines players), a deckshoe class which allows the dealer to deal from a shuffled stack of decks (based on the deck class), and a personal blackjack player which inherits from the blackjack player to create a better player.

# Optimizations:
Implemented the MyBlackjackPlayer class (inherting from the BlackjackPlayer class) to create a smarter blackjack player with more of a strategy for playing the game. Designed a strategy for placing bets based on the number of chips the player is holding, only alloting 10% or less of their chips for betting once their store has dipped below ~400 chips. Additionally, the player  hits if they are below a hand score of at least 16 or their bet is only 10% or less of their chips- player stays otherwise.

# Built With:
Java
