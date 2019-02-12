# ShopprRecipe_App
Shoppr simplifies making and eating healthy food, letting users create and manage recipes and generating custom grocery lists

CURRENT CODE REVIEW:
As it stands, the code covers pretty much all of the use cases in some manner.  Originally, the use case
for creating new recipes involved viewing and downloading recipes from some database source but after 
looking into 3 different APIs for gathering recipes, only 2 had a non-paid option and of those 2, both
still required credit/debit card information to access.  So, my current implementation allows the user
to create recipes locally.

Another use case was to be able to view saved recipes locally.  This feature is (for the most part)
implemented.  The only current issue is that using my current implementation, all recipes that can be
viewed in the 'saved recipes' activity are lost upon restarting the app.  Given further time, I would
implement a way to save the new recipe data into internal storage that could be accessed when viewing
the 'saved recipes' activity.

The last use case was to create a condensed shopping list that involved the ingredients of recipes the
user has saved.  This feature is also virtually completely implemented.  The only issue with this aspect of
the code is that since users can input their own text for ingredients when creating a recipe, I couldn't come
up with an elegant way to handle say if one recipe says '1 cup milk' and another says 'milk (2 cups)'.  Ideally,
my shopping list would condense that to one entry of 3 cups of milk but unless I forced a certain format for
ingredient entry, this issue seems very difficult to resolve.  The shopping list works, but each ingredient from
each recipe is listed individually, even if they are the same ingredient.

During the revision period, I'd hope to implement automated unit tests for the recipe creation and saved
recipe/shopping list generation.  As well as fix a bug that allows for creating blank recipes that currently exists.
Another feature that might be useful if saved recipe persistence across app instances was achieved would be the
ability to delete saved recipes from storage so that they are no longer visible inside of the app.
