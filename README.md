# Solitaire

This Solitaire game is written in Java
This is one of my projects which I did during my master's
This whole game is run on terminal using commands

suit: The suit of the card (HEART, SPADE, CLUB, DIAMOND)
value: The value of the card (ACE, KING, QUEEN, JACK, 10, 9, 8, 7, 6, 5, 4, 3, 2)
deck: The deck of cards.
pile: The pile of cards that have been flipped over.
lanes: A list of stacks of cards, representing the lanes in the game.

Commands: Q- Quit
          D- Draw
        Eg: [P1-7DHCS][1-7DHCS][0-9]

Scoring:
    Moving a card from the pile to a lane: +5 points
    Moving a card from the pile to a suit: +10 points
    Moving a card from a lane to a lane and revealing a new card: +5 points
    Moving a card from a suit to a lane: -10 points
    Moving a card from a lane to a suit: +20 points