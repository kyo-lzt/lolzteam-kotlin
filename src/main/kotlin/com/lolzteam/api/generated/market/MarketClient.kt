// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market

import com.lolzteam.api.runtime.ClientConfig
import com.lolzteam.api.runtime.LolzteamHttpClient
import com.lolzteam.api.runtime.RateLimitConfig
import com.lolzteam.api.runtime.RequestOptions
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.serializer
import java.io.Closeable

public class CategoryApi(private val http: LolzteamHttpClient) {

    /**
     * Get Last Accounts
     *
     * Displays a list of latest accounts.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     */
	suspend fun all(params: CategoryAllParams? = null): CategoryAllResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Steam
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailType[] Email type.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param itemDomain Domain of native/autoreg email.
     * @param game[] List of games.
     * @param hoursPlayed List of minimum hours played by game.
     * @param hoursPlayedMax List of maximum hours played by game.
     * @param eg Guarantee type.
     * @param vac[] List of VAC bans by game.
     * @param vacSkipGameCheck Don't check game existence while checking for vac.
     * @param rt Has community ban.
     * @param tradeBan Has lifetime trade ban.
     * @param tradeLimit Has temporary trade limit.
     * @param daybreak Number of days the account has been offline.
     * @param limit Has 5 $ limit.
     * @param mafile Has .mafile (Steam Guard Authenticator).
     * @param reg How old is the account.
     * @param regPeriod In what notation is time measured.
     * @param lmin Minimum level.
     * @param lmax Maximum level.
     * @param rmin Minimum rank in CS2 Matchmaking.
     * @param rmax Maximum rank in CS2 Matchmaking.
     * @param wingmanRmin Minimum rank in CS2 Wingman.
     * @param wingmanRmax Maximum rank in CS2 Wingman.
     * @param noVac Has no VAC ban.
     * @param mmBan Has CS2 Matchmaking ban.
     * @param balanceMin Minimum balance.
     * @param balanceMax Maximum balance.
     * @param invGame Game ID to check inventory price.
     * @param invMin Minimum inventory price for game.
     * @param invMax Maximum inventory price for game.
     * @param friendsMin Minimum number of friends.
     * @param friendsMax Maximum number of friends.
     * @param gmin Minimum number of games.
     * @param gmax Maximum number of games.
     * @param winCountMin Minimum number of wins.
     * @param winCountMax Maximum number of wins.
     * @param medalId[] List of medal IDs.
     * @param medalOperatorOr Search for medals using "OR" instead of "AND".
     * @param medalMin Minimum number of medals.
     * @param medalMax Maximum number of medals.
     * @param gift[] List of gifts.
     * @param giftMin Minimum number of gifts.
     * @param giftMax Maximum number of gifts.
     * @param recentlyHoursMin Minimum number of recently played hours.
     * @param recentlyHoursMax Maximum number of recently played hours.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     * @param cs2ProfileRankMin Minimum CS2 rank.
     * @param cs2ProfileRankMax Maximum CS2 rank.
     * @param solommrMin Minimum number of Dota 2 MMR.
     * @param solommrMax Maximum number of Dota 2 MMR.
     * @param d2GameCountMin Minimum number of Dota 2 games.
     * @param d2GameCountMax Maximum number of Dota 2 games.
     * @param d2WinCountMin Minimum number of Dota 2 wins.
     * @param d2WinCountMax Maximum number of Dota 2 wins.
     * @param d2BehaviorMin Minimum number of Dota 2 behavior.
     * @param d2BehaviorMax Maximum number of Dota 2 behavior.
     * @param faceitLvlMin Minimum FACEIT level.
     * @param faceitLvlMax Maximum FACEIT level.
     * @param pointsMin Minimum number of Steam points.
     * @param pointsMax Maximum number of Steam points.
     * @param relevantGmin Minimum number of relevant games.
     * @param relevantGmax Maximum number of relevant games.
     * @param lastTransDate How old is last transaction.
     * @param lastTransDatePeriod In what notation is time measured.
     * @param lastTransDateLater How new is last transaction.
     * @param lastTransDatePeriodLater In what notation is time measured.
     * @param noTrans Has no transactions.
     * @param trans Has transactions.
     * @param giftsPurchaseMin Minimum amount spent on gifts.
     * @param giftsPurchaseMax Maximum amount spent on gifts.
     * @param refundsPurchaseMin Minimum amount of refunds.
     * @param refundsPurchaseMax Minimum amount of refunds.
     * @param ingamePurchaseMin Minimum spend amount on in-game purchases.
     * @param ingamePurchaseMax Maximum spend amount on in-game purchases.
     * @param gamesPurchaseMin Minimum spend amount on all purchases.
     * @param gamesPurchaseMax Maximum spend amount on all purchases.
     * @param purchaseMin Minimum spend amount on all purchases.
     * @param purchaseMax Maximum spend amount on all purchases.
     * @param hasActivatedKeys Has activated keys.
     * @param eloMin Minimum Premier ELO in CS2.
     * @param eloMax Maximum Premier ELO in CS2.
     * @param cs2MapRank Map for rank in CS2.
     * @param cs2MapRmin Minimum rank in CS2 on a certain map.
     * @param cs2MapRmax Maximum rank in CS2 on a certain map.
     * @param hasFaceit Has FACEIT account.
     * @param faceitCsgoLvlMin Minimum FACEIT level.
     * @param faceitCsgoLvlMax Maximum FACEIT level.
     * @param rustDeathsMin Minimum number of Rust deaths
     * @param rustDeathsMax Maximum number of Rust deaths
     * @param rustKillsMin Minimum number of Rust kills
     * @param rustKillsMax Maximum number of Rust kills
     * @param d2LastMatchDate How old is last match of Dota 2.
     * @param d2LastMatchDatePeriod In what notation is time measured.
     * @param cardsMin Minimum number of available to collect trading cards.
     * @param cardsMax Maximum number of available to collect trading cards.
     * @param cardsGamesMin Minimum number of available games with available to collect trading cards.
     * @param cardsGamesMax Maximum number of available games with available to collect trading cards.
     * @param skipVacInv Ignore inventory value if game has VAC ban.
     */
	suspend fun steam(params: CategorySteamParams? = null): CategorySteamResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/steam",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Fortnite
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param emailType[] Email type.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param tempEmail Access to market temp mail.
     * @param itemDomain Domain of native/autoreg email.
     * @param eg Guarantee type.
     * @param smin Minimum number of skins.
     * @param smax Maximum number of skins.
     * @param vbmin Minimum number of V-Bucks.
     * @param vbmax Maximum number of V-Bucks.
     * @param skin[] Skins.
     * @param pickaxe[] Pickaxes.
     * @param glider[] Gliders.
     * @param dance[] Dances.
     * @param changeEmail Can change email.
     * @param platform[] Platform.
     * @param skinsShopMin Minimum number of shop skins.
     * @param skinsShopMax Maximum number of shop skins.
     * @param pickaxesShopMin Minimum number of shop pickaxes.
     * @param pickaxesShopMax Maximum number of shop pickaxes.
     * @param dancesShopMin Minimum number of shop dances.
     * @param dancesShopMax Maximum number of shop dances.
     * @param glidersShopMin Minimum number of shop gliders.
     * @param glidersShopMax Maximum number of shop gliders.
     * @param skinsShopVbmin Minimum total cost of all skins in the shop in V-Bucks.
     * @param skinsShopVbmax Maximum total cost of all skins in the shop in V-Bucks.
     * @param pickaxesShopVbmin Minimum total cost of all pickaxes in the shop in V-Bucks.
     * @param pickaxesShopVbmax Maximum total cost of all pickaxes in the shop in V-Bucks.
     * @param dancesShopVbmin Minimum total cost of all dances in the shop in V-Bucks.
     * @param dancesShopVbmax Maximum total cost of all dances in the shop in V-Bucks.
     * @param glidersShopVbmin Minimum total cost of all gliders in the shop in V-Bucks.
     * @param glidersShopVbmax Maximum total cost of all gliders in the shop in V-Bucks.
     * @param bp Has Battle Pass.
     * @param lmin Minimum level.
     * @param lmax Maximum level.
     * @param bpLmin Minimum level of Battle Pass.
     * @param bpLmax Maximum level of Battle Pass.
     * @param lastTransDate How old is last transaction.
     * @param lastTransDatePeriod In what notation is time measured.
     * @param noTrans Has no transactions.
     * @param xboxLinkable Can be linked to Xbox.
     * @param psnLinkable Can be linked to PSN.
     * @param daybreak Number of days the account has been offline.
     * @param rlPurchases Has Rocket League purchases.
     * @param reg How old is the account.
     * @param regPeriod In what notation is time measured.
     * @param refundCreditsMin Minimum number of available refund credits.
     * @param refundCreditsMax Maximum number of available refund credits.
     * @param pickaxeMin Minimum number of pickaxes.
     * @param pickaxeMax Maximum number of pickaxes.
     * @param dmin Minimum number of dances.
     * @param dmax Maximum number of dances.
     * @param gmin Minimum number of gliders.
     * @param gmax Maximum number of gliders.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     */
	suspend fun fortnite(params: CategoryFortniteParams? = null): CategoryFortniteResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/fortnite",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * miHoYo
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param emailType[] Email type.
     * @param parseSameItemIds Parse same item ids.
     * @param itemDomain Domain of native/autoreg email.
     * @param email Has linked email.
     * @param ea Has linked external accounts.
     * @param region Region.
     * @param notRegion List of disallowed regions.
     * @param genshinCharacter[] List of characters.
     * @param genshinCharacterConstellations List of minimum constellations on characters.
     * @param genshinCharacterConstellationsMax List of maximum constellations on characters.
     * @param genshinWeapon[] List of weapons.
     * @param genshinCharMin Minimum number of characters.
     * @param genshinCharMax Maximum number of characters.
     * @param genshinLegendaryMin Minimum number of legendary characters.
     * @param genshinLegendaryMax Maximum number of legendary characters.
     * @param genshinLevelMin Minimum level.
     * @param genshinLevelMax Maximum level.
     * @param genshinLegendaryWeaponMin Minimum number of legendary weapon characters.
     * @param genshinLegendaryWeaponMax Maximum number of legendary weapon characters.
     * @param constellationsMin Minimum number of constellations on legendary characters.
     * @param constellationsMax Maximum number of constellations on legendary characters.
     * @param genshinAchievementMin Minimum number of achievements.
     * @param genshinAchievementMax Maximum number of achievements.
     * @param genshinCurrencyMin Minimum number of primogems.
     * @param genshinCurrencyMax Maximum number of primogems.
     * @param honkaiCharacter[] List of characters.
     * @param honkaiCharacterEidolons List of minimum eidolons on characters.
     * @param honkaiCharacterEidolonsMax List of maximum eidolons on characters.
     * @param honkaiWeapon[] List of weapons.
     * @param honkaiCharMin Minimum number of characters.
     * @param honkaiCharMax Maximum number of characters.
     * @param honkaiLegendaryMin Minimum number of legendary characters.
     * @param honkaiLegendaryMax Maximum number of legendary characters.
     * @param honkaiLevelMin Minimum level.
     * @param honkaiLevelMax Maximum level.
     * @param honkaiLegendaryWeaponMin Minimum number of legendary weapon characters.
     * @param honkaiLegendaryWeaponMax Maximum number of legendary weapon characters.
     * @param eidolonsMin Minimum number of constellations on Honkai: Star Rail legendary characters.
     * @param eidolonsMax Maximum number of legendary Honkai: Star Rail weapon characters.
     * @param honkaiAchievementMin Minimum number of achievements.
     * @param honkaiAchievementMax Maximum number of achievements.
     * @param honkaiCurrencyMin Minimum number of Stellar Jade.
     * @param honkaiCurrencyMax Maximum number of Stellar Jade.
     * @param zenlessCharacter[] List of Zenless Zone Zero characters.
     * @param zenlessCharacterCinemas List of minimum cinemas on characters.
     * @param zenlessCharacterCinemasMax List of maximum cinemas on characters.
     * @param zenlessWeapon[] List of Zenless Zone Zero weapons.
     * @param zenlessLegendaryMin Minimum number of Zenless Zone Zero legendary characters.
     * @param zenlessLegendaryMax Maximum number of Zenless Zone Zero legendary characters.
     * @param cinemasMin Minimum number of cinemas on Zenless Zone Zero characters.
     * @param cinemasMax Maximum number of cinemas on Zenless Zone Zero characters.
     * @param zenlessLegendaryWeaponMin Minimum number of legendary Zenless Zone Zero weapon characters.
     * @param zenlessLegendaryWeaponMax Maximum number of legendary Zenless Zone Zero weapon characters.
     * @param zenlessCharMin Minimum number of Zenless Zone Zero characters.
     * @param zenlessCharMax Maximum number of Zenless Zone Zero characters.
     * @param zenlessLevelMin Minimum Zenless Zone Zero level.
     * @param zenlessLevelMax Maximum Zenless Zone Zero level.
     * @param zenlessAchievementMin Minimum count of Zenless Zone Zero achievements.
     * @param zenlessAchievementMax Maximum count of Zenless Zone Zero achievements.
     * @param zenlessCurrencyMin Minimum count of Zenless Zone Zero polychrome.
     * @param zenlessCurrencyMax Maximum count of Zenless Zone Zero polychrome.
     * @param daybreak Number of days the account has been offline.
     */
	suspend fun mihoyo(params: CategoryMihoyoParams? = null): CategoryMihoyoResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/mihoyo",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Riot
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param rmin Minimum valorant rank.
     * @param rmax Maximum valorant rank.
     * @param lastRmin Last minimum valorant rank.
     * @param lastRmax Last maximum valorant rank.
     * @param previousRmin Previous minimum rank.
     * @param previousRmax Previous maximum rank.
     * @param weaponSkin[] List of weapon skins.
     * @param buddy[] List of buddies.
     * @param agent[] List of agents.
     * @param champion[] List of champions.
     * @param skin[] List of LoL skins.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     * @param daybreak Number of days the account has been offline.
     * @param valorantLevelMin Minimum level in Valorant.
     * @param valorantLevelMax Maximum level in Valorant.
     * @param lolLevelMin Minimum level in LoL.
     * @param lolLevelMax Maximum level in LoL.
     * @param invMin Minimum inventory value.
     * @param invMax Maximum inventory value.
     * @param vpMin Minimum number of Valorant points.
     * @param vpMax Maximum number of Valorant points.
     * @param valorantSmin Minimum number of skins.
     * @param valorantSmax Maximum number of skins.
     * @param valorantRankType[] List of allowed rank types.
     * @param amin Minimum amount of agents.
     * @param amax Maximum amount of agents.
     * @param valorantRegion[] List of allowed regions in Valorant.
     * @param valorantNotRegion[] List of disallowed regions in Valorant.
     * @param lolRegion[] List of allowed regions in LoL.
     * @param lolNotRegion[] List of disallowed regions in LoL.
     * @param knife Has any knife.
     * @param lolSmin Minimum number of skins in LoL.
     * @param lolSmax Maximum number of skins in LoL.
     * @param championMin Minimum number of champions.
     * @param championMax Maximum number of champions.
     * @param winRateMin Minimum win-rate.
     * @param winRateMax Maximum win-rate.
     * @param blueMin Minimum wallet blue balance.
     * @param blueMax Maximum wallet blue balance.
     * @param orangeMin Minimum wallet orange balance.
     * @param orangeMax Maximum wallet orange balance.
     * @param mythicMin Minimum wallet mythic balance.
     * @param mythicMax Maximum wallet mythic balance.
     * @param riotMin Minimum wallet riot balance.
     * @param riotMax Maximum wallet riot balance.
     * @param email Has linked email.
     * @param tel Has linked mobile.
     * @param valorantKnifeMin Minimum knifes in Valorant.
     * @param valorantKnifeMax Maximum knifes in Valorant.
     * @param rpMin Minimum number of Valorant Radiant Points.
     * @param rpMax Maximum number of Valorant Radiant Points.
     * @param faMin Minimum number of Valorant free agents.
     * @param faMax Maximum number of Valorant free agents.
     * @param lolRank[] List of allowed ranks in LoL.
     */
	suspend fun riot(params: CategoryRiotParams? = null): CategoryRiotResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/riot",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Telegram
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param spam Has a spam ban.
     * @param password Has a cloud password.
     * @param premium Has a premium subscription.
     * @param premiumExpiration When premium subscription will be active
     * @param premiumExpirationPeriod In what notation is time measured
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     * @param daybreak Number of days the account has been offline.
     * @param minChannels Minimum number of channels.
     * @param maxChannels Maximum number of channels.
     * @param minChats Minimum number of chats.
     * @param maxChats Maximum number of chats.
     * @param minConversations Minimum number of conversations.
     * @param maxConversations Maximum number of conversations.
     * @param minAdmin Minimum number of channels, where account is administrator/owner.
     * @param maxAdmin Maximum number of channels, where account is administrator/owner.
     * @param minAdminSub Minimum number of subscribers in channel, where account is administrator/owner.
     * @param maxAdminSub Maximum number of subscribers in channel, where account is administrator/owner.
     * @param digMin Minimum number of digits in ID.
     * @param digMax Maximum number of digits in ID.
     * @param minContacts Minimum number of contacts.
     * @param maxContacts Maximum number of contacts.
     * @param minStars Minimum number of Telegram Stars.
     * @param maxStars Maximum number of Telegram Stars.
     * @param birthday Birthday was X time before.
     * @param birthdayPeriod In what notation is time measured.
     * @param birthdayAfter Birthday was X time after.
     * @param birthdayAfterPeriod In what notation is time measured.
     * @param minId Minimum ID of account, will be rounded down till nearest 10k. Available if your balance is higher than 100000 RUB.
     * @param maxId Maximum ID of account, will be rounded down till nearest 10k. Available if your balance is higher than 100000 RUB.
     * @param allowGeoSpamblock Allow geo spam block in search with spam=no.
     * @param minGifts Minimum number of Telegram gifts on account.
     * @param maxGifts Maximum number of Telegram gifts on account.
     * @param minNftGifts Minimum number of Telegram NFT gifts on account.
     * @param maxNftGifts Maximum number of Telegram NFT gifts on account.
     * @param minGiftsStars Minimum value of all Stars gifts.
     * @param maxGiftsStars Maximum value of all Stars gifts.
     * @param minGiftsConvertStars Minimum value of all Stars gifts after convert.
     * @param maxGiftsConvertStars Maximum value of all Stars gifts after convert.
     * @param dcId[] List of allowed DC ID.
     * @param notDcId[] List of disallowed DC ID.
     * @param email Has linked email.
     * @param minBots Minimum number of bots.
     * @param maxBots Maximum number of bots.
     * @param minBotActiveUsers Minimum active users in bot.
     * @param maxBotActiveUsers Maximum active users in bot.
     */
	suspend fun telegram(params: CategoryTelegramParams? = null): CategoryTelegramResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/telegram",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Supercell
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param daybreak Number of days the account has been offline.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param eg Guarantee type.
     * @param tel Has linked mobile.
     * @param brawlLevelMin Minimum Brawl Stars level.
     * @param brawlLevelMax Maximum Brawl Stars level.
     * @param brawlCupMin Minimum number of Brawl Stars trophies.
     * @param brawlCupMax Maximum number of Brawl Stars trophies.
     * @param brawlWinsMin Minimum number of Brawl Stars wins.
     * @param brawlWinsMax Maximum number of Brawl Stars wins.
     * @param brawlPass Has Brawl Pass.
     * @param brawler[] List of brawlers.
     * @param brawlersMin Minimum number of brawlers.
     * @param brawlersMax Maximum number of brawlers.
     * @param legendaryBrawlersMin Minimum number of legendary brawlers.
     * @param legendaryBrawlersMax Maximum number of legendary brawlers.
     * @param royaleLevelMin Minimum Clash Royale level.
     * @param royaleLevelMax Maximum Clash Royale level.
     * @param royaleCupMin Minimum number of Clash Royale trophies.
     * @param royaleCupMax Maximum number of Clash Royale trophies.
     * @param royaleWinsMin Minimum number of Clash Royale wins.
     * @param royaleWinsMax Maximum number of Clash Royale wins.
     * @param kingLevelMin Minimum King level in Clash Royale.
     * @param kingLevelMax Maximum King level in Clash Royale.
     * @param royalePass Has Royale Pass.
     * @param clashLevelMin Minimum Clash of Clans level.
     * @param clashLevelMax Maximum Clash of Clans level.
     * @param clashCupMin Minimum number of Clash of Clans trophies.
     * @param clashCupMax Maximum number of Clash of Clans trophies.
     * @param clashWinsMin Minimum number of Clash of Clans wins.
     * @param clashWinsMax Maximum number of Clash of Clans wins.
     * @param clashPass Has Battle Pass.
     * @param totalHeroesLevelMin Minimum total heroes level count in Clash of Clans.
     * @param totalHeroesLevelMax Maximum total heroes level count in Clash of Clans.
     * @param totalTroopsLevelMin Minimum total troops level count in Clash of Clans.
     * @param totalTroopsLevelMax Maximum total troops level count in Clash of Clans.
     * @param totalSpellsLevelMin Minimum total spells level count in Clash of Clans.
     * @param totalSpellsLevelMax Maximum total spells level count in Clash of Clans.
     * @param totalBuilderHeroesLevelMin Minimum total builder village heroes level count in Clash of Clans.
     * @param totalBuilderHeroesLevelMax Maximum total builder village heroes level count in Clash of Clans.
     * @param totalBuilderTroopsLevelMin Minimum total builder village troops level count in Clash of Clans.
     * @param totalBuilderTroopsLevelMax Maximum total builder village troops level count in Clash of Clans.
     * @param townHallLevelMin Minimum level of town hall.
     * @param townHallLevelMax Maximum level of town hall.
     * @param builderHallLevelMin Minimum level of builder hall.
     * @param builderHallLevelMax Maximum level of builder hall.
     * @param builderHallCupMin Minimum number of builder hall cups.
     * @param builderHallCupMax Maximum number of builder hall cups.
     * @param creationYearMin Minimum account creation year (e.g. 2023).
     * @param creationYearMax Maximum account creation year (e.g. 2024).
     */
	suspend fun supercell(params: CategorySupercellParams? = null): CategorySupercellResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/supercell",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * EA (Origin)
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param game[] List of games.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     * @param gmin Minimum count of games.
     * @param gmax Maximum count of games.
     * @param alRankMin Minimum rank points in Apex Legends.
     * @param alRankMax Maximum rank points in Apex Legends.
     * @param alLevelMin Minimum level in Apex Legends.
     * @param alLevelMax Maximum level in Apex Legends.
     * @param hasBan Has a ban in any game.
     * @param xboxConnected Xbox connected to account.
     * @param steamConnected Steam connected to account.
     * @param psnConnected PSN connected to account.
     * @param subscription Name of subscription.
     * @param subscriptionLength Length of subscription.
     * @param subscriptionPeriod In what notation is time measured.
     * @param hoursPlayed List of minimum hours played by game.
     * @param hoursPlayedMax List of maximum hours played by game.
     * @param transactions Has transactions.
     */
	suspend fun ea(params: CategoryEaParams? = null): CategoryEaResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/ea",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * World of Tanks
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param tel Has linked mobile.
     * @param daybreak Number of days the account has been offline.
     * @param battlesMin Minimum number of battles.
     * @param battlesMax Maximum number of battles.
     * @param goldMin Minimum number of gold.
     * @param goldMax Maximum number of gold.
     * @param silverMin Minimum number of silver.
     * @param silverMax Maximum number of silver.
     * @param topMin Minimum number of top tanks.
     * @param topMax Maximum number of top tanks.
     * @param premMin Minimum number of premium tanks.
     * @param premMax Maximum number of premium tanks.
     * @param topPremMin Minimum number of top premium tanks.
     * @param topPremMax Maximum number of top premium tanks.
     * @param winPmin Minimum number of wins.
     * @param winPmax Maximum number of wins.
     * @param tank[] List of tanks.
     * @param region[] Region.
     * @param notRegion[] Exclude region.
     * @param premium Has a premium subscription.
     * @param premiumExpiration When premium subscription will be active
     * @param premiumExpirationPeriod In what notation is time measured
     * @param clan Has clan.
     * @param clanRole[] List of allowed clan role.
     * @param notClanRole[] List of disallowed clan role.
     * @param clanGoldMin Minimum number of gold in clan treasure.
     * @param clanGoldMax Maximum number of gold in clan treasure.
     * @param clanCreditsMin Minimum number of credits in clan treasure.
     * @param clanCreditsMax Maximum number of credits in clan treasure.
     * @param clanCrystalMin Minimum number of crystal in clan treasure.
     * @param clanCrystalMax Maximum number of crystal in clan treasure.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     */
	suspend fun wot(params: CategoryWotParams? = null): CategoryWotResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/world-of-tanks",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * WoT Blitz
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param tel Has linked mobile.
     * @param daybreak Number of days the account has been offline.
     * @param battlesMin Minimum number of battles.
     * @param battlesMax Maximum number of battles.
     * @param goldMin Minimum number of gold.
     * @param goldMax Maximum number of gold.
     * @param silverMin Minimum number of silver.
     * @param silverMax Maximum number of silver.
     * @param topMin Minimum number of top tanks.
     * @param topMax Maximum number of top tanks.
     * @param premMin Minimum number of premium tanks.
     * @param premMax Maximum number of premium tanks.
     * @param topPremMin Minimum number of top premium tanks.
     * @param topPremMax Maximum number of top premium tanks.
     * @param winPmin Minimum number of wins.
     * @param winPmax Maximum number of wins.
     * @param tank[] List of tanks.
     * @param region[] Region.
     * @param notRegion[] Exclude region.
     * @param premium Has a premium subscription.
     * @param premiumExpiration When premium subscription will be active
     * @param premiumExpirationPeriod In what notation is time measured
     * @param clan Has clan.
     * @param clanRole[] List of allowed clan role.
     * @param notClanRole[] List of disallowed clan role.
     * @param clanGoldMin Minimum number of gold in clan treasure.
     * @param clanGoldMax Maximum number of gold in clan treasure.
     * @param clanCreditsMin Minimum number of credits in clan treasure.
     * @param clanCreditsMax Maximum number of credits in clan treasure.
     * @param clanCrystalMin Minimum number of crystal in clan treasure.
     * @param clanCrystalMax Maximum number of crystal in clan treasure.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     */
	suspend fun wotBlitz(params: CategoryWotBlitzParams? = null): CategoryWotBlitzResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/wot-blitz",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Gifts
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param subscription Name of subscription.
     * @param subscriptionLength Length of subscription.
     * @param subscriptionPeriod In what notation is time measured.
     */
	suspend fun gifts(params: CategoryGiftsParams? = null): CategoryGiftsResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/gifts",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Epic Games
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param eg Guarantee type.
     * @param game[] List of games.
     * @param changeEmail Can change email.
     * @param rlPurchases Has Rocket League purchases.
     * @param balanceMin Minimum epic wallet balance.
     * @param balanceMax Maximum epic wallet balance.
     * @param rewardsBalanceMin Minimum rewards balance.
     * @param rewardsBalanceMax Maximum rewards balance.
     * @param gmin Minimum number of games.
     * @param gmax Maximum number of games.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     * @param daybreak Number of days the account has been offline.
     * @param hoursPlayed List of minimum hours played by game.
     * @param hoursPlayedMax List of maximum hours played by game.
     */
	suspend fun epicGames(params: CategoryEpicGamesParams? = null): CategoryEpicGamesResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/epicgames",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Escape from Tarkov
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param region Region.
     * @param version[] List of versions.
     * @param reg How old is the account.
     * @param regPeriod In what notation is time measured.
     * @param levelMin Minimum level.
     * @param levelMax Maximum level.
     * @param pve Access to pve.
     * @param side Side in current wipe.
     */
	suspend fun escapeFromTarkov(params: CategoryEscapeFromTarkovParams? = null): CategoryEscapeFromTarkovResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/escape-from-tarkov",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Social Club
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param daybreak Number of days the account has been offline.
     * @param levelMin Minimum number of Social Club level.
     * @param levelMax Maximum number of Social Club level.
     * @param cashMin Minimum number of GTA V cash
     * @param cashMax Maximum number of GTA V cash
     * @param bankCashMin Minimum number of GTA V bank cash
     * @param bankCashMax Maximum number of GTA V bank cash
     * @param game[] List of games.
     */
	suspend fun socialClub(params: CategorySocialClubParams? = null): CategorySocialClubResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/socialclub",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Uplay
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param game[] List of games.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     * @param daybreak Number of days the account has been offline.
     * @param gmin Minimum count of games.
     * @param gmax Maximum count of games.
     * @param subscription Name of subscription.
     * @param subscriptionLength Length of subscription.
     * @param subscriptionPeriod In what notation is time measured.
     * @param r6LevelMin Minimum level in Tom Clancy's Rainbow Six Siege.
     * @param r6LevelMax Maximum level in Tom Clancy's Rainbow Six Siege.
     * @param r6RankMin Minimum rank points in Tom Clancy's Rainbow Six Siege.
     * @param r6RankMax Maximum rank points in Tom Clancy's Rainbow Six Siege.
     * @param r6OperatorsMin Minimum count of operators in Tom Clancy's Rainbow Six Siege.
     * @param r6OperatorsMax Maximum count of operators in Tom Clancy's Rainbow Six Siege.
     * @param r6Ban Is account banned in Tom Clancy's Rainbow Six Siege
     * @param r6Smin Minimum number of skins in Tom Clancy's Rainbow Six Siege.
     * @param r6Smax Maximum number of skins in Tom Clancy's Rainbow Six Siege.
     * @param r6Skin[] List of weapon skins in Tom Clancy's Rainbow Six Siege.
     * @param r6Operator[] List of operators in Tom Clancy's Rainbow Six Siege.
     * @param xboxConnected Xbox connected to account.
     * @param psnConnected PSN connected to account.
     * @param steamConnected Steam connected to account.
     * @param balanceMin Minimum balance.
     * @param balanceMax Maximum balance.
     * @param transactions Has transactions.
     * @param reg How old is the account.
     * @param regPeriod In what notation is time measured.
     */
	suspend fun uplay(params: CategoryUplayParams? = null): CategoryUplayResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/uplay",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Discord
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param tel Has linked mobile.
     * @param nitro Has nitro.
     * @param nitroType[] Nitro type.
     * @param nitroLength Length of nitro.
     * @param nitroPeriod In what notation is time measured.
     * @param boostsMin Minimum number of boosts.
     * @param boostsMax Maximum number of boosts.
     * @param billing Has billing.
     * @param gifts Has gifts.
     * @param transactions Has transactions.
     * @param badge[] List of badges.
     * @param condition[] List of account conditions.
     * @param chatMin Minimum number of chats.
     * @param chatMax Maximum number of chats.
     * @param minAdminMembers Minimum number of subscribers in server, where account is administrator/owner.
     * @param maxAdminMembers Maximum number of subscribers in server, where account is administrator/owner.
     * @param minAdmin Minimum number of servers, where account is administrator/owner.
     * @param maxAdmin Maximum number of servers, where account is administrator/owner.
     * @param reg How old is the account.
     * @param regPeriod In what notation is time measured.
     * @param language[] List of languages.
     * @param notLanguage[] List of languages that won't be included.
     * @param clans Has clans.
     * @param minAdminClans Minimum number of clans, where account is administrator.
     * @param maxAdminClans Maximum number of clans, where account is administrator.
     * @param minOwnerClans Minimum number of clans, where account is owner.
     * @param maxOwnerClans Maximum number of clans, where account is owner.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     * @param minServers Minimum count of servers.
     * @param maxServers Maximum count of servers.
     * @param 2fa Has two-factor authentication.
     * @param minFullCredits Minimum number of Nitro full credits.
     * @param maxFullCredits Maximum number of Nitro full credits.
     * @param minBasicCredits Minimum number of Nitro basic credits.
     * @param maxBasicCredits Maximum number of Nitro basic credits.
     * @param minOrbs Minimum number of Discord Orbs.
     * @param maxOrbs Maximum number of Discord Orbs.
     */
	suspend fun discord(params: CategoryDiscordParams? = null): CategoryDiscordResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/discord",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * TikTok
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param tel Has linked mobile.
     * @param reg How old is the account.
     * @param regPeriod In what notation is time measured.
     * @param followersMin Minimum number of followers.
     * @param followersMax Maximum number of followers.
     * @param postMin Minimum number of posts.
     * @param postMax Maximum number of posts.
     * @param likeMin Minimum number of likes.
     * @param likeMax Maximum number of likes.
     * @param coinsMin Minimum number of coins.
     * @param coinsMax Maximum number of coins.
     * @param cookieLogin Login by cookies.
     * @param verified Has verified.
     * @param email Has linked email.
     */
	suspend fun tikTok(params: CategoryTikTokParams? = null): CategoryTikTokResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/tiktok",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Instagram
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param tel Has linked mobile.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     * @param cookies Login by cookies.
     * @param loginWithoutCookies Login without cookies.
     * @param followersMin Minimum number of followers.
     * @param followersMax Maximum number of followers.
     * @param postMin Minimum number of posts.
     * @param postMax Maximum number of posts.
     * @param reg How old is the account.
     * @param regPeriod In what notation is time measured.
     */
	suspend fun instagram(params: CategoryInstagramParams? = null): CategoryInstagramResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/instagram",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * BattleNet
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param eg Guarantee type.
     * @param game[] List of games.
     * @param daybreak Number of days the account has been offline.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     * @param tel Has linked mobile.
     * @param editBtag Can edit BattleTag.
     * @param changeableFn Can edit full name.
     * @param realId Real id.
     * @param parentControl Has disabled parent control.
     * @param noBans Has no bans.
     * @param balanceMin Minimum balance.
     * @param balanceMax Maximum balance.
     */
	suspend fun battleNet(params: CategoryBattleNetParams? = null): CategoryBattleNetResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/battlenet",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * ChatGPT
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param emailType[] Email type.
     * @param itemDomain Domain of native/autoreg email.
     * @param subscription[] List of allowed subscriptions.
     * @param subscriptionLength Length of subscription.
     * @param subscriptionPeriod In what notation is time measured.
     * @param autorenewal Is auto renewal enabled.
     * @param tel Has linked mobile.
     * @param transactions Has transactions.
     * @param reg How old is the account.
     * @param regPeriod In what notation is time measured.
     * @param openaiTier[] List of allowed tiers.
     * @param openaiBalanceMin Minimum OpenAI credit balance.
     * @param openaiBalanceMax Maximum OpenAI credit balance.
     */
	suspend fun chatGPT(params: CategoryChatGPTParams? = null): CategoryChatGPTResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/chatgpt",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * VPN
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param service[] List of allowed VPN services.
     * @param subscriptionLength Length of subscription.
     * @param subscriptionPeriod In what notation is time measured.
     * @param autorenewal Is auto renewal enabled.
     */
	suspend fun vpn(params: CategoryVpnParams? = null): CategoryVpnResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/vpn",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Roblox
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param email Has verified email.
     * @param robuxMin Minimum robux.
     * @param robuxMax Maximum robux.
     * @param friendsMin Minimum friends.
     * @param friendsMax Maximum friends.
     * @param followersMin Minimum number of followers.
     * @param followersMax Maximum number of followers.
     * @param country List of allowed countries.
     * @param notCountry List of disallowed countries.
     * @param reg How old is the account.
     * @param regPeriod In what notation is time measured.
     * @param subscription Name of subscription.
     * @param subscriptionLength Length of subscription.
     * @param subscriptionPeriod In what notation is time measured.
     * @param autorenewal Is auto renewal enabled.
     * @param xboxConnected Xbox connected to account.
     * @param psnConnected PSN connected to account.
     * @param verified Has verified.
     * @param ageVerified Account is age verified via documents.
     * @param incomingRobuxTotalMin Minimum amount of incoming robux.
     * @param incomingRobuxTotalMax Maximum amount of incoming robux.
     * @param limitedPriceMin Minimum limited items value.
     * @param limitedPriceMax Maximum limited items value.
     * @param gamepassMin Minimum total Robux cost of all game passes in popular Roblox games..
     * @param gamepassMax Maximum total Robux cost of all game passes in popular Roblox games..
     * @param gameDonations Has game donations.
     * @param invMin Minimum inventory value.
     * @param invMax Maximum inventory value.
     * @param ugcLimitedPriceMin Minimum UGC limited items value.
     * @param ugcLimitedPriceMax Maximum UGC limited items value.
     * @param creditBalanceMin Minimum credit balance.
     * @param creditBalanceMax Maximum credit balance.
     * @param offsaleMin Minimum offsale items count.
     * @param offsaleMax Maximum offsale items count.
     * @param voice Voice chat is available.
     * @param ageGroup[] List of allowed age groups.
     * @param notAgeGroup[] List of disallowed age groups.
     */
	suspend fun roblox(params: CategoryRobloxParams? = null): CategoryRobloxResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/roblox",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Warface
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param rankMin Minimum rank.
     * @param rankMax Maximum rank.
     * @param bonusRankMin Minimum bonus rank.
     * @param bonusRankMax Maximum bonus rank.
     * @param tel Has linked mobile.
     * @param daybreak Number of days the account has been offline.
     * @param kreditsMin Minimum amount of Kredits.
     * @param kreditsMax Maximum amount of Kredits.
     * @param totalKreditsMin Minimum total donated Kredits.
     * @param totalKreditsMax Maximum total donated Kredits.
     */
	suspend fun warface(params: CategoryWarfaceParams? = null): CategoryWarfaceResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/warface",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Minecraft
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param subscription Name of subscription.
     * @param subscriptionLength Length of subscription.
     * @param subscriptionPeriod In what notation is time measured.
     * @param autorenewal Is auto renewal enabled.
     * @param java Has java edition.
     * @param bedrock Has bedrock edition.
     * @param dungeons Has Minecraft Dungeons.
     * @param legends Has Minecraft Legends.
     * @param changeNickname Can change nickname.
     * @param capes[] List of capes.
     * @param capesMin Minimum number of capes.
     * @param capesMax Maximum number of capes.
     * @param country[] List of allowed countries.
     * @param notCountry[] List of disallowed countries.
     * @param hypixelBan Has active Hypixel ban.
     * @param hypixelSkyblockApiEnabled Is API enabled in Hypixel Skyblock.
     * @param rankHypixel[] Rank on hypixel.
     * @param levelHypixelMin Minimum number of level hypixel.
     * @param levelHypixelMax Maximum number of level hypixel.
     * @param achievementHypixelMin Minimum number of achievement hypixel.
     * @param achievementHypixelMax Maximum number of achievement hypixel.
     * @param levelHypixelSkyblockMin Minimum level on Hypixel SkyBlock.
     * @param levelHypixelSkyblockMax Maximum level on Hypixel SkyBlock.
     * @param netWorthHypixelSkyblockMin Minimum net worth on Hypixel SkyBlock.
     * @param netWorthHypixelSkyblockMax Maximum net worth on Hypixel SkyBlock.
     * @param reg How old is the account.
     * @param regPeriod In what notation is time measured.
     * @param lastLoginHypixel How old is the last login account.
     * @param lastLoginHypixelPeriod In what notation is time measured.
     * @param canChangeDetails Can change details.
     * @param nicknameLengthMin Minimum number of characters in nickname.
     * @param nicknameLengthMax Maximum number of characters in nickname.
     * @param hypixelBanParsed Was Hypixel ban parsed by Market.
     * @param minecoinsMin Minimum number of Minecoins.
     * @param minecoinsMax Maximum number of Minecoins.
     */
	suspend fun minecraft(params: CategoryMinecraftParams? = null): CategoryMinecraftResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/minecraft",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Hytale
     *
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     * @param edition[] List of allowed editions.
     * @param profilesMin Minimum number of profiles with game.
     * @param profilesMax Maximum number of profiles with game.
     */
	suspend fun hytale(params: CategoryHytaleParams? = null): CategoryHytaleResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/hytale",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Get Categories
     *
     * Display category list.
     *
     * @param topQueries Display top queries for per category.
     */
	suspend fun list(params: CategoryListParams? = null): CategoryListResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/category",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
			isSearch = true,
		)))
	}

    /**
     * Get Category Search Params
     *
     * Displays search parameters for a category.
     *
     * @param categoryName Category name.
     */
	suspend fun params(categoryName: String): CategoryParamsResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$categoryName/params",
			isSearch = true,
		)))
	}

    /**
     * Get Category Games
     *
     * Displays a list of games in the category.
     *
     * @param categoryName Category name.
     */
	suspend fun games(categoryName: String): CategoryGamesResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$categoryName/games",
			isSearch = true,
		)))
	}
}


public class ListApi(private val http: LolzteamHttpClient) {

    /**
     * Get All User Accounts
     *
     * Displays a list of user accounts.
     *
     * @param userId User id.
     * @param categoryId Accounts category.
     * @param page The number of the page to display results from.
     * @param show Account status.
     * @param deleteReason Delete reason. (Only if show is set to deleted)
     * @param title The word or words contained in the account title.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param login Login.
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param orderBy Order by.
     * @param sb Sold before.
     * @param sbByMe Sold by me before.
     * @param nsb Not sold before.
     * @param nsbByMe Not sold by me before.
     * @param username Username of buyer. (If show is paid)
     * @param publishedStartDate Start date for filtering by publication date.
     * @param publishedEndDate End date for filtering by publication date.
     * @param filterByPublishedDate Enable filtering by publication date.
     * @param paidStartDate Start date for filtering by buyer operation date.
     * @param paidEndDate End date for filtering by buyer operation date.
     * @param filterByBuyerOperationDate Enable filtering by buyer operation date.
     * @param deleteStartDate Start date for filtering by deletion date.
     * @param deleteEndDate End date for filtering by deletion date.
     * @param filterByDeleteDate Enable filtering by deletion date.
     */
	suspend fun user(params: ListUserParams? = null): ListUserResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/user/items",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get All Purchased Accounts
     *
     * Displays a list of purchased accounts.
     *
     * @param userId User id.
     * @param categoryId Accounts category.
     * @param page The number of the page to display results from.
     * @param show Account status.
     * @param title The word or words contained in the account title.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param login Login.
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param orderBy Order by.
     * @param sb Sold before.
     * @param sbByMe Sold by me before.
     * @param nsb Not sold before.
     * @param nsbByMe Not sold by me before.
     */
	suspend fun orders(params: ListOrdersParams? = null): ListOrdersResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/user/orders",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get User Items States
     *
     * Returns the states of user items.
     *
     * @param userId User ID.
     */
	suspend fun states(params: ListStatesParams? = null): ListStatesResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/user/item-states",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Download Accounts Data
     *
     * Download accounts data in the specified format.
     *
     * @param type The type of account list to download.
     * @param format Format of the downloaded accounts.
     * @param customFormat Custom format string for download. (Required if format is set to custom)
     * @param categoryId Accounts category.
     * @param page The number of the page to display results from.
     * @param show Account status.
     * @param deleteReason Delete reason. (Only if show is set to deleted)
     * @param title The word or words contained in the account title.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param orderBy Order by.
     * @param sb Sold before.
     * @param sbByMe Sold by me before.
     * @param nsb Not sold before.
     * @param nsbByMe Not sold by me before.
     * @param username Username of buyer. (If show is paid)
     * @param publishedStartDate Start date for filtering by publication date.
     * @param publishedEndDate End date for filtering by publication date.
     * @param filterByPublishedDate Enable filtering by publication date.
     * @param paidStartDate Start date for filtering by buyer operation date.
     * @param paidEndDate End date for filtering by buyer operation date.
     * @param filterByBuyerOperationDate Enable filtering by buyer operation date.
     * @param deleteStartDate Start date for filtering by deletion date.
     * @param deleteEndDate End date for filtering by deletion date.
     * @param filterByDeleteDate Enable filtering by deletion date.
     */
	suspend fun download(type: String, params: ListDownloadParams? = null): ListDownloadResponse {
		return http.requestText(RequestOptions(
			method = "GET",
			path = "/user/$type/download",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

    /**
     * Get All Favourites Accounts
     *
     * Displays a list of favourites accounts.
     *
     * @param page The number of the page to display results from.
     * @param show Account status.
     * @param title The word or words contained in the account title.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param orderBy Order by.
     * @param sb Sold before.
     * @param sbByMe Sold by me before.
     * @param nsb Not sold before.
     * @param nsbByMe Not sold by me before.
     */
	suspend fun favorites(params: ListFavoritesParams? = null): ListFavoritesResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/fave",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get All Viewed Accounts
     *
     * Displays a list of viewed accounts.
     *
     * @param page The number of the page to display results from.
     * @param show Account status.
     * @param title The word or words contained in the account title.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param orderBy Order by.
     * @param sb Sold before.
     * @param sbByMe Sold by me before.
     * @param nsb Not sold before.
     * @param nsbByMe Not sold by me before.
     */
	suspend fun viewed(params: ListViewedParams? = null): ListViewedResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/viewed",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}
}


public class ManagingApi(private val http: LolzteamHttpClient) {

    /**
     * Get Account
     *
     * Displays account information.
     *
     * @param itemId Item id.
     * @param parseSameItemIds Parse same item ids.
     */
	suspend fun get(itemId: Int, params: ManagingGetParams? = null): ManagingGetResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$itemId",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Delete Account
     *
     * Deletes your account from public search. Deletion type is soft. You can restore account after deletion if you want.
     *
     * @param itemId Item id.
     * @param reason Delete reason.
     */
	suspend fun delete(itemId: Int, body: ManagingDeleteBody? = null): ManagingDeleteResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Create Claim
     *
     * Create a claim.
     *
     * @param itemId Item id.
     * @param postBody You should describe what's happened. - describe the situation in a nutshell. If you wish, you can describe the situation in more detail using the "Spoiler" function. - attach screenshots of correspondence. You must upload to the site [Imgur](https://imgur.com/upload) - other evidence; - notify the respondent about the complaint you created, familiarize him with hidden content Describe the situation in as much detail as possible.
     */
	suspend fun createClaim(body: ManagingCreateClaimBody? = null): ManagingCreateClaimResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/claims",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Bulk Get Accounts
     *
     * Bulk get up to 250 accounts.
     *
     * @param itemId Item id.
     * @param parseSameItemIds Parse same item ids.
     */
	suspend fun bulkGet(body: ManagingBulkGetBody): ManagingBulkGetResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/bulk/items",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Account Steam Inventory Value
     *
     * Gets Account steam inventory value.
     *
     * @param itemId Item id.
     * @param appId Application id.
     * @param currency Currency in which the inventory value will be returned
     * @param ignoreCache Ignore cache.
     */
	suspend fun steamInventoryValue(itemId: Int, params: ManagingSteamInventoryValueParams? = null): ManagingSteamInventoryValueResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/inventory-value",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Steam Inventory Value
     *
     * Gets steam inventory value.
     * > 📘 This method is rate limited. You can send 20 requests per minute (3s delay between requests)
     *
     * @param link Link or id of account. Can be [https://lzt.market/{item-id}/, https://steamcommunity.com/id/{steam-name}, https://steamcommunity.com/profiles/{steam-id}, {steam-id}].
     * @param appId Application id.
     * @param currency Currency in which the inventory value will be returned
     * @param ignoreCache Ignore cache.
     */
	suspend fun steamValue(params: ManagingSteamValueParams? = null): ManagingSteamValueResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/steam-value",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Steam HTML
     *
     * Returns Steam account profile/games preview.
     *
     * @param itemId Item id.
     * @param type Type of page.
     */
	suspend fun steamPreview(itemId: Int, params: ManagingSteamPreviewParams? = null): ManagingSteamPreviewResponse {
		return http.requestText(RequestOptions(
			method = "GET",
			path = "/$itemId/steam-preview",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		))
	}

    /**
     * Edit Account
     *
     * Edits any details of account.
     *
     * @param itemId Item id.
     * @param title Title of account. If title specified and title_en is empty, title_en will be automatically translated to English language.
     * @param titleEn English title of account. If title_en specified and title is empty, title will be automatically translated to Russian language.
     * @param price Current price of account in your currency.
     * @param itemOrigin Account origin. Where did you get it from.
     * @param emailLoginData Email login data (email:password format).
     * @param emailType Email type.
     * @param allowAskDiscount Allow users to ask discount for this account.
     * @param proxyId Using proxy id for account checking. See GET or POST /proxy to get or edit proxy list.
     * @param description Account public description.
     * @param information Account private information (visible only for buyer).
     */
	suspend fun edit(itemId: Int, body: ManagingEditBody? = null): ManagingEditResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/$itemId/edit",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get AI Price
     *
     * Get AI-suggested price for the account.
     *
     * @param itemId Item id.
     */
	suspend fun aIPrice(itemId: Int): ManagingAIPriceResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/ai-price",
		)))
	}

    /**
     * Get Auto Buy Price
     *
     * Get auto buy price for the account.
     *
     * @param itemId Item id.
     */
	suspend fun autoBuyPrice(itemId: Int): ManagingAutoBuyPriceResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/auto-buy-price",
		)))
	}

    /**
     * Edit Note
     *
     * Edits a note for the account.
     *
     * @param itemId Item id.
     * @param text Text of note.
     */
	suspend fun note(itemId: Int, body: ManagingNoteBody? = null): ManagingNoteResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/note-save",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Update Inventory Value
     *
     * Update inventory value.
     *
     * @param itemId Item id.
     * @param all Update the entire Steam inventory.
     * @param appId Application id.
     * @param authorize Parse inventory when authorized (Parse trade banned items).
     */
	suspend fun steamUpdateValue(itemId: Int, body: ManagingSteamUpdateValueBody? = null): ManagingSteamUpdateValueResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/update-inventory",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Bump Account
     *
     * Bumps account in the search.
     *
     * @param itemId Item id.
     */
	suspend fun bump(itemId: Int): ManagingBumpResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/bump",
		)))
	}

    /**
     * Auto Bump
     *
     * Enables/edits automatic bumping for the specified account.
     *
     * @param itemId Item id.
     * @param hour Interval in hours
     */
	suspend fun autoBump(itemId: Int, body: ManagingAutoBumpBody? = null): ManagingAutoBumpResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/auto-bump",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Disable Auto Bump
     *
     * Disables automatic bumping for the specified account.
     *
     * @param itemId Item id.
     */
	suspend fun autoBumpDisable(itemId: Int): ManagingAutoBumpDisableResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/auto-bump",
		)))
	}

    /**
     * Open Account
     *
     * Opens account.
     *
     * @param itemId Item id.
     */
	suspend fun open(itemId: Int): ManagingOpenResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/open",
		)))
	}

    /**
     * Close Account
     *
     * Closes account.
     *
     * @param itemId Item id.
     */
	suspend fun close(itemId: Int): ManagingCloseResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/close",
		)))
	}

    /**
     * Get Account Image
     *
     * Get account image.
     *
     * @param itemId Item id.
     * @param type Type of image.
     */
	suspend fun image(itemId: Int, params: ManagingImageParams? = null): ManagingImageResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/image",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Email Confirmation Code
     *
     * Gets confirmation code or link.
     * 
     * > ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times)
     *
     * @param itemId Item id.
     */
	suspend fun emailCode(itemId: Int): ManagingEmailCodeResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/email-code",
		)))
	}

    /**
     * Get Email Letters
     *
     * Returns account letters.
     * 
     * > ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times)
     *
     * @param emailPassword Email login data (email:password format). Required if both *email* and *password* are not provided.
     * @param email Email. Required if *email_password* is not provided.
     * @param password Password. Required if *email_password* is not provided.
     * @param limit Number of letters to return.
     */
	suspend fun getLetters2(params: ManagingGetLetters2Params? = null): ManagingGetLetters2Response {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/letters2",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Mafile
     *
     * Returns steam mafile.
     * > ❗️ This action is cancelling active account guarantee
     *
     * @param itemId Item id.
     */
	suspend fun steamGetMafile(itemId: Int): ManagingSteamGetMafileResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/mafile",
		)))
	}

    /**
     * Add Mafile
     *
     * Add a new Steam mafile to the account.
     *
     * @param itemId Item id.
     */
	suspend fun steamAddMafile(itemId: Int): ManagingSteamAddMafileResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/mafile",
		)))
	}

    /**
     * Remove Mafile
     *
     * Remove steam mafile.
     * > ❗️ This will unlink the authenticator from the account and remove mafile from the item
     *
     * @param itemId Item id.
     */
	suspend fun steamRemoveMafile(itemId: Int): ManagingSteamRemoveMafileResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/mafile",
		)))
	}

    /**
     * Get Mafile Confirmation Code
     *
     * Gets confirmation code from MaFile (Only for Steam accounts).
     *
     * @param itemId Item id.
     */
	suspend fun steamMafileCode(itemId: Int): ManagingSteamMafileCodeResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/guard-code",
		)))
	}

    /**
     * Confirm SDA
     *
     * Confirm steam action. 
     * 
     *  Don't set id and nonce parameters to get list of available confirmation requests. 
     * 
     * > ❗️ This action is cancelling active account guarantee
     *
     * @param itemId Item id.
     * @param id Confirmation id. (Required along with nonce if you want to confirm action).
     * @param nonce Confirmation nonce. (Required along with id if you want to confirm action).
     */
	suspend fun steamSDA(itemId: Int, body: ManagingSteamSDABody? = null): ManagingSteamSDAResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/confirm-sda",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Telegram Confirmation Code
     *
     * Gets confirmation code from Telegram.
     *
     * @param itemId Item id.
     */
	suspend fun telegramCode(itemId: Int): ManagingTelegramCodeResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/telegram-login-code",
		)))
	}

    /**
     * Telegram Reset Auth
     *
     * Resets Telegram authorizations.
     *
     * @param itemId Item id.
     */
	suspend fun telegramResetAuth(itemId: Int): ManagingTelegramResetAuthResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/telegram-reset-authorizations",
		)))
	}

    /**
     * Cancel Guarantee
     *
     * Cancel guarantee of account. It can be useful for account reselling.
     *
     * @param itemId Item id.
     */
	suspend fun refuseGuarantee(itemId: Int): ManagingRefuseGuaranteeResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/refuse-guarantee",
		)))
	}

    /**
     * Decline Video Recording Request
     *
     * Waiver of the requirement to record a video and any claims regarding this account.
     *
     * @param itemId Item id.
     * @param iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem You voluntarily and with full awareness of your actions waive any claims regarding this account.
     */
	suspend fun declineVideoRecording(itemId: Int, body: ManagingDeclineVideoRecordingBody? = null): ManagingDeclineVideoRecordingResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/decline-video-recording",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Check Guarantee
     *
     * Checks the guarantee and cancels it if there are reasons to cancel it.
     *
     * @param itemId Item id.
     */
	suspend fun checkGuarantee(itemId: Int): ManagingCheckGuaranteeResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/check-guarantee",
		)))
	}

    /**
     * Change Password
     *
     * Changes password of account.
     *
     * @param itemId Item id.
     * @param Cancel Cancel change password recommendation. It will be helpful, if you don't want to change password and get login data.
     */
	suspend fun changePassword(itemId: Int, body: ManagingChangePasswordBody? = null): ManagingChangePasswordResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/change-password",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Temp Email Password
     *
     * Gets password from temp email of account. After calling of this method, the guarantee will be cancelled and you cannot automatically resell account.
     * > ❗️ This action is cancelling active account guarantee
     *
     * @param itemId Item id.
     */
	suspend fun tempEmailPassword(itemId: Int): ManagingTempEmailPasswordResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/$itemId/temp-email-password",
		)))
	}

    /**
     * Add a Tag
     *
     * Adds a tag to the specified account.
     *
     * @param itemId Item id.
     * @param tagId Tag ID.
     */
	suspend fun tag(itemId: Int, body: ManagingTagBody? = null): ManagingTagResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/tag",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Remove a Tag
     *
     * Removes a tag from from the specified account.
     *
     * @param itemId Item id.
     * @param tagId Tag ID.
     */
	suspend fun untag(itemId: Int, body: ManagingUntagBody? = null): ManagingUntagResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/tag",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Add a Public Tag
     *
     * Adds a public tag to the specified account.
     *
     * @param itemId Item id.
     * @param tagId Tag ID.
     */
	suspend fun publicTag(itemId: Int, body: ManagingPublicTagBody? = null): ManagingPublicTagResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/public-tag",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Remove a Public Tag
     *
     * Removes a public tag from the specified account.
     *
     * @param itemId Item id.
     * @param tagId Tag ID.
     */
	suspend fun publicUntag(itemId: Int, body: ManagingPublicUntagBody? = null): ManagingPublicUntagResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/public-tag",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Favorite
     *
     * Adds account to favorites.
     *
     * @param itemId Item id.
     */
	suspend fun favorite(itemId: Int): ManagingFavoriteResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/star",
		)))
	}

    /**
     * Unfavorite
     *
     * Delete account from favorites.
     *
     * @param itemId Item id.
     */
	suspend fun unfavorite(itemId: Int): ManagingUnfavoriteResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/star",
		)))
	}

    /**
     * Stick Account
     *
     * Stick account in the top of search.
     *
     * @param itemId Item id.
     */
	suspend fun stick(itemId: Int): ManagingStickResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/stick",
		)))
	}

    /**
     * Unstick Account
     *
     * Unstick account from the top of search.
     *
     * @param itemId Item id.
     */
	suspend fun unstick(itemId: Int): ManagingUnstickResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/stick",
		)))
	}

    /**
     * Change Account Owner
     *
     * Transfer account to another user.
     *
     * @param itemId Item id.
     * @param username The username of the new account owner.
     * @param secretAnswer Secret answer of your account.
     */
	suspend fun transfer(itemId: Int, body: ManagingTransferBody? = null): ManagingTransferResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/change-owner",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class ProfileApi(private val http: LolzteamHttpClient) {

    /**
     * Get Claims
     *
     * Returns a list of claims filed against you.
     *
     * @param type Filter claims by their type.
     * @param claimState Filter claims by their state.
     */
	suspend fun claims(params: ProfileClaimsParams? = null): ProfileClaimsResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/claims",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Profile
     *
     * Displays info about your profile.
     *
     * @param fieldsInclude List of hidden fields to include.
     */
	suspend fun get(params: ProfileGetParams? = null): ProfileGetResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/me",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Edit Market Settings
     *
     * Change settings about your profile on the market.
     *
     * @param allowAcceptAccounts Usernames who can transfer market accounts to you. Separate values with a comma.
     * @param telegramApiId Telegram api id.
     * @param telegramApiHash Telegram api hash.
     * @param telegramDeviceModel Telegram device model.
     * @param telegramSystemVersion Telegram system version.
     * @param telegramAppVersion Telegram app version.
     * @param telegramLangPack Telegram lang pack.
     * @param telegramLangCode Telegram lang code.
     * @param telegramSystemLangCode Telegram system lang code.
     * @param clearTelegramClient Clear Telegram data.
     */
	suspend fun edit(body: ProfileEditBody? = null): ProfileEditResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/me",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class CartApi(private val http: LolzteamHttpClient) {

    /**
     * Get Cart Items
     *
     * Returns the list of items currently in your cart.
     *
     * @param categoryId Accounts category.
     * @param page The number of the page to display results from.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param title The word or words contained in the account title.
     * @param orderBy Order by.
     * @param tagId[] List of tag ids (Tag list is available via GET /me).
     * @param notTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param publicTagId[] List of tag ids (Tag list is available via GET /me).
     * @param notPublicTagId[] List of tag ids that won't be included (Tag list is available via GET /me).
     * @param origin[] List of account origins.
     * @param notOrigin[] List of account origins that won't be included.
     * @param userId Search accounts of user.
     * @param nsb Not sold before.
     * @param sb Sold before.
     * @param nsbByMe Not sold by me before.
     * @param sbByMe Sold by me before.
     * @param currency Currency in which the cost of the account will be searched.
     * @param emailLoginData Has email login data.
     * @param emailProvider[] Email provider.
     * @param notEmailProvider[] Email provider.
     * @param parseSameItemIds Parse same item ids.
     */
	suspend fun get(params: CartGetParams? = null): CartGetResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/cart",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Add Item to Cart
     *
     * Adds item to your cart.
     *
     * @param itemId Item id.
     */
	suspend fun add(body: CartAddBody): CartAddResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/cart",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete Item From Cart
     *
     * Deletes an item from the cart.
     *
     * @param itemId Item id.
     */
	suspend fun delete(body: CartDeleteBody? = null): CartDeleteResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/cart",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class PurchasingApi(private val http: LolzteamHttpClient) {

    /**
     * Fast Buy Account
     *
     * Check and buy account.
     * 
     * > ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).
     *
     * @param itemId Item id.
     * @param price Current price of account in your currency.
     * @param balanceId Balance ID that will be used to purchase specified item.
     */
	suspend fun fastBuy(itemId: Int, body: PurchasingFastBuyBody? = null): PurchasingFastBuyResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/fast-buy",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Check Account
     *
     * Checking account for validity.
     * 
     * > ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).
     *
     * @param itemId Item id.
     */
	suspend fun check(itemId: Int): PurchasingCheckResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/check-account",
		)))
	}

    /**
     * Confirm Buy
     *
     * Confirm buy.
     * 
     * > ❗️ This method doesn't check account for validity. If you want to confirm validity before buying, you should use [FastBuy](https://lzt-market.readme.io/reference/purchasingfastbuy) method
     *
     * @param itemId Item id.
     * @param price Current price of account in your currency.
     * @param balanceId Balance ID that will be used to purchase specified item.
     */
	suspend fun confirm(itemId: Int, body: PurchasingConfirmBody? = null): PurchasingConfirmResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/confirm-buy",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Discount Request
     *
     * Request a discount for the specified item.
     *
     * @param itemId Item id.
     * @param discountPrice Requested discounted price.
     * @param message Message to the seller.
     */
	suspend fun discountRequest(itemId: Int, body: PurchasingDiscountRequestBody? = null): PurchasingDiscountRequestResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/discount",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Cancel Discount Request
     *
     * Cancel a requested discount for the specified item.
     *
     * @param itemId Item id.
     */
	suspend fun discountCancel(itemId: Int): PurchasingDiscountCancelResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/$itemId/discount",
		)))
	}
}


public class CustomDiscountsApi(private val http: LolzteamHttpClient) {

    /**
     * Get Custom Discounts
     *
     * Get a list of custom discounts.
     */
	suspend fun get(): CustomDiscountsGetResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/custom-discounts",
		)))
	}

    /**
     * Create Custom Discount
     *
     * Creates a new custom discount.
     *
     * @param userId User ID.
     * @param categoryId Accounts category.
     * @param discountPercent Discount percent to apply.
     * @param minPrice Minimum accounts price for which the discount applies.
     * @param maxPrice Maximum accounts price for which the discount applies.
     */
	suspend fun create(body: CustomDiscountsCreateBody? = null): CustomDiscountsCreateResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/custom-discounts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Edit Custom Discount
     *
     * Edit an existing custom discount.
     *
     * @param discountId ID of the discount to edit.
     * @param discountPercent Discount percent to apply.
     * @param minPrice Minimum price for which the discount applies.
     * @param maxPrice Maximum price for which the discount applies.
     */
	suspend fun edit(body: CustomDiscountsEditBody? = null): CustomDiscountsEditResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "PUT",
			path = "/custom-discounts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete Custom Discount
     *
     * Delete an existing custom discount.
     *
     * @param discountId ID of the discount to delete.
     */
	suspend fun delete(body: CustomDiscountsDeleteBody? = null): CustomDiscountsDeleteResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/custom-discounts",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class PublishingApi(private val http: LolzteamHttpClient) {

    /**
     * Fast Account Upload
     *
     * Adds and checks the account for validity.
     * 
     * > ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).
     *
     * @param title Title of account. If title specified and title_en is empty, title_en will be automatically translated to English language.
     * @param titleEn English title of account. If title_en specified and title is empty, title will be automatically translated to Russian language.
     * @param price Current price of account in your currency.
     * @param categoryId Accounts category.
     * @param itemOrigin Account origin. Where did you get it from.
     * @param extendedGuarantee Guarantee type.
     * @param allowAskDiscount Allow users to ask discount for this account.
     * @param proxyId Proxy id that will be used to check account.
     * @param randomProxy Set this parameter to true so that the Market will take a random proxy from its pool for each of your requests. Otherwise, if this parameter is set to false or not set, the Market will take a specific proxy from its pool, which is predefined for each item. > This parameter only works with proxies from the Market pool. If you want to use your own proxies, use the proxy_id or extra[proxy] parameter.
     * @param description Account public description.
     * @param information Account private information (visible only for buyer).
     * @param login Account login (or email).
     * @param password Account password.
     * @param loginPassword Account login data (login:password format).
     * @param hasEmailLoginData Required if a category is one of list of Required email login data categories.
     * @param emailLoginData Required if a category is one of list of Required email login data categories. Email login data (email:password format).
     * @param emailType Email type.
     */
	suspend fun fastSell(body: PublishingFastSellBody? = null): PublishingFastSellResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/item/fast-sell",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Add Account
     *
     * Adds account on the market.
     * 
     * Required email login data categories:
     * + 9 - Fortnite
     * + 12 - Epic games
     * + 18 - Escape from Tarkov
     *
     * @param title Title of account. If title specified and title_en is empty, title_en will be automatically translated to English language.
     * @param titleEn English title of account. If title_en specified and title is empty, title will be automatically translated to Russian language.
     * @param price Current price of account in your currency.
     * @param categoryId Accounts category.
     * @param itemOrigin Account origin. Where did you get it from.
     * @param extendedGuarantee Guarantee type.
     * @param description Account public description.
     * @param information Account private information (visible only for buyer).
     * @param forceTempEmail Get temporary email if not required by category. Available for Supercell, Fortnite and Epic Games categories.
     * @param resellItemId Put item id, if you are trying to resell item. This is useful to pass temporary email from reselling item to new item. You will get same temporary email from reselling account.
     * @param hasEmailLoginData Required if a category is one of list of Required email login data categories.
     * @param emailLoginData Required if a category is one of list of Required email login data categories. Email login data (email:password format).
     * @param emailType Email type.
     * @param allowAskDiscount Allow users to ask discount for this account.
     * @param proxyId Proxy id that will be used to check account.
     * @param randomProxy Set this parameter to true so that the Market will take a random proxy from its pool for each of your requests. Otherwise, if this parameter is set to false or not set, the Market will take a specific proxy from its pool, which is predefined for each item. > This parameter only works with proxies from the Market pool. If you want to use your own proxies, use the proxy_id or extra[proxy] parameter.
     */
	suspend fun add(body: PublishingAddBody? = null): PublishingAddResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/item/add",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Check Account Details
     *
     * Check and put up to sale not published account OR update account information existing account.
     * 
     * > ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).
     *
     * @param itemId Item id.
     * @param resellItemId Put if you are trying to resell an account.
     * @param randomProxy Set this parameter to true so that the Market will take a random proxy from its pool for each of your requests. Otherwise, if this parameter is set to false or not set, the Market will take a specific proxy from its pool, which is predefined for each item. > This parameter only works with proxies from the Market pool. If you want to use your own proxies, use the proxy_id or extra[proxy] parameter.
     * @param login Account login (or email).
     * @param password Account password.
     * @param loginPassword Account login data (login:password format).
     * @param hasEmailLoginData Required if a category is one of list of Required email login data categories.
     * @param emailLoginData Required if a category is one of list of Required email login data categories. Email login data (email:password format).
     * @param emailType Email type.
     */
	suspend fun check(itemId: Int, body: PublishingCheckBody? = null): PublishingCheckResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/goods/check",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Add an External Account
     *
     * Check and add an external account to your item.
     * 
     * > ❗️ Please note that if you're linking a Social Club account to Steam, it will update the last activity on your account (This is a limitation of Steam). If Social Club Games does not have a linked account, do not enter any data.
     *
     * @param itemId Item id.
     * @param type External account type.
     * @param login Account login data (login:password format).
     * @param emailLoginData Email login data (email:password format).
     * @param cookies Cookies.
     */
	suspend fun external(itemId: Int, body: PublishingExternalBody? = null): PublishingExternalResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/$itemId/external-account",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class PaymentsApi(private val http: LolzteamHttpClient) {

    /**
     * Get Invoice
     *
     * Get invoice.
     * 
     * Required scopes:
     * + invoice
     *
     * @param invoiceId Invoice ID.
     * @param paymentId Payment ID.
     */
	suspend fun invoiceGet(params: PaymentsInvoiceGetParams? = null): PaymentsInvoiceGetResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/invoice",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Create Invoice
     *
     * Create invoice.
     * 
     * Required scopes:
     * + invoice
     *
     * @param amount Invoice amount.
     * @param paymentId Payment ID in your system (must be unique within the merchant / invoices).
     * @param comment Comment to the invoice.
     * @param urlSuccess URL to redirect to after successful payment.
     * @param urlCallback Callback url.
     * @param merchantId Merchant ID.
     * @param requiredTelegramId Telegram User ID for which the invoice was created.
     * @param requiredTelegramUsername Telegram Username (including @) for which the invoice was created (if any).
     * @param lifetime Invoice lifetime.
     * @param additionalData Additional information for you.
     * @param isTest Create a test invoice.
     */
	suspend fun invoiceCreate(body: PaymentsInvoiceCreateBody? = null): PaymentsInvoiceCreateResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/invoice",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Get Invoice List
     *
     * Get invoice list.
     * 
     * Required scopes:
     * + invoice
     *
     * @param page The number of the page to display results from.
     * @param currency Currency of the created invoice.
     * @param status Status of the invoice.
     * @param amount Invoice amount.
     * @param merchantId Merchant ID.
     */
	suspend fun invoiceList(params: PaymentsInvoiceListParams? = null): PaymentsInvoiceListResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/invoice/list",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Currency
     *
     * Get currency list.
     */
	suspend fun currency(): PaymentsCurrencyResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/currency",
		)))
	}

    /**
     * Get List Of Balances
     *
     * Returns list of balances.
     */
	suspend fun balanceList(): PaymentsBalanceListResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/balance/exchange",
		)))
	}

    /**
     * Exchange Balance
     *
     * Transfer funds from one balance to another.
     *
     * @param fromBalance Source balance type
     * @param toBalance Target balance type
     * @param amount Amount to exchange
     */
	suspend fun balanceExchange(body: PaymentsBalanceExchangeBody? = null): PaymentsBalanceExchangeResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/balance/exchange",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Transfer Money
     *
     * Transfer money to any user.
     * 
     * Required scopes:
     * + payment
     *
     * @param userId User id of receiver. If user_id specified, username is not required.
     * @param username Username of receiver. If username specified, user_id is not required.
     * @param amount Amount to send in your currency.
     * @param comment Transfer comment.
     * @param telegramDeal Is the deal happening on Telegram?
     * @param telegramUsername Telegram username of the user you are dialoguing with.
     * @param transferHold Hold transfer or not.
     * @param holdLengthValue Hold length value.
     * @param holdLengthOption Hold length option.
     */
	suspend fun transfer(body: PaymentsTransferBody? = null): PaymentsTransferResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/balance/transfer",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Check Transfer Fee
     *
     * Get transfer limits and get fee amount for transfer.
     * 
     * Required scopes:
     * + payment
     *
     * @param amount Amount you want to send in your currency.
     */
	suspend fun fee(params: PaymentsFeeParams? = null): PaymentsFeeResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/balance/transfer/fee",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Cancel Transfer
     *
     * Cancels a transfer with a hold that was sent to your account.
     * 
     * Required scopes:
     * + payment
     *
     * @param paymentId Payment id.
     */
	suspend fun cancel(body: PaymentsCancelBody? = null): PaymentsCancelResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/balance/transfer/cancel",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Payments History
     *
     * Displays list of your payments.
     * 
     * Required scopes:
     * + payment
     *
     * @param type Type of operation.
     * @param pmin Minimal price of account (Inclusive).
     * @param pmax Maximum price of account (Inclusive).
     * @param currency Currency.
     * @param page The number of the page to display results from.
     * @param operationIdLt Id of the operation from which the result begins.
     * @param receiver Username of user, which receive money from you.
     * @param sender Username of user, which sent money to you.
     * @param isApi Returns payments that are done via API.
     * @param startDate Start date of operation (RFC 3339 date format).
     * @param endDate End date of operation (RFC 3339 date format).
     * @param wallet Wallet, which used for money payouts.
     * @param comment Comment for money transfers.
     * @param isHold Display hold operations.
     * @param showPaymentStats Display payment stats for selected period (outgoing value, incoming value).
     */
	suspend fun history(params: PaymentsHistoryParams? = null): PaymentsHistoryResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/user/payments",
			query = params?.let { http.json.encodeToJsonElement(serializer(), it) },
		)))
	}

    /**
     * Get Payout Services
     *
     * Get a list of available payout services.
     */
	suspend fun payoutServices(): PaymentsPayoutServicesResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/balance/payout/services",
		)))
	}

    /**
     * Create Payout
     *
     * Creates a payout request.
     */
	suspend fun payout(body: PaymentsPayoutBody? = null): PaymentsPayoutResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/balance/payout",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class AutoPaymentsApi(private val http: LolzteamHttpClient) {

    /**
     * Get Auto Payments
     *
     * Get auto payments list.
     * 
     * Required scopes:
     * + payment
     */
	suspend fun list(): AutoPaymentsListResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/auto-payments",
		)))
	}

    /**
     * Create Auto Payment
     *
     * Creates auto payment.
     * 
     * Required scopes:
     * + payment
     *
     * @param secretAnswer Secret answer.
     * @param usernameReceiver Username of the payment receiver.
     * @param day Day of the month for the payment. (Use "0" for the last day of the month)
     * @param amount Amount to be transferred.
     * @param description Payment description.
     */
	suspend fun create(body: AutoPaymentsCreateBody? = null): AutoPaymentsCreateResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/auto-payment",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete Auto Payment
     *
     * Deletes an auto payment.
     * 
     * Required scopes:
     * + payment
     *
     * @param autoPaymentId Auto payment ID.
     */
	suspend fun delete(body: AutoPaymentsDeleteBody? = null): AutoPaymentsDeleteResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/auto-payment",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class ProxyApi(private val http: LolzteamHttpClient) {

    /**
     * Get Proxy
     *
     * Gets your proxy list.
     */
	suspend fun get(): ProxyGetResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "GET",
			path = "/proxy",
		)))
	}

    /**
     * Add Proxy
     *
     * Add single proxy or proxy list.
     * 
     * 
     * To add single proxy use this parameters:
     * 
     * 
     * + proxy_ip (required) - proxy ip or host
     * + proxy_port (required) - proxy port
     * + proxy_user (optional) - proxy username
     * + proxy_pass (optional) - proxy password
     * 
     * To add proxy list use this parameters:
     * 
     * 
     * + proxy_row (required) - proxy list in String format ip:port:user:pass. Each proxy must be start with new line (use \n separator)
     *
     * @param proxyIp Proxy ip or host. Required if proxy_row is not specified.
     * @param proxyPort Proxy port. Required if proxy_row is not specified.
     * @param proxyUser Proxy username. Required if proxy_row is not specified.
     * @param proxyPass Proxy password. Required if proxy_row is not specified.
     * @param proxyRow Proxy list in String format ip:port:user:pass. Each proxy must be start with new line (use \r\n separator)
     */
	suspend fun add(body: ProxyAddBody): ProxyAddResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/proxy",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete Proxy
     *
     * Delete single or all proxies.
     *
     * @param proxyId Id of an existing proxy.
     * @param deleteAll Delete all proxies.
     */
	suspend fun delete(body: ProxyDeleteBody? = null): ProxyDeleteResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/proxy",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class ImapApi(private val http: LolzteamHttpClient) {

    /**
     * Create IMAP Configuration
     *
     * Create an IMAP configuration for a domain.
     *
     * @param domain Domain to delete IMAP configuration for.
     * @param imapServer IMAP server address.
     * @param port IMAP server port.
     * @param secure Whether to use a secure connection.
     */
	suspend fun create(body: ImapCreateBody? = null): ImapCreateResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/imap",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}

    /**
     * Delete IMAP Configuration
     *
     * Delete an IMAP configuration for a domain.
     *
     * @param domain Domain to delete IMAP configuration for.
     */
	suspend fun delete(body: ImapDeleteBody? = null): ImapDeleteResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "DELETE",
			path = "/imap",
			body = body?.let { http.json.encodeToJsonElement(serializer(), it) },
			bodyEncoding = "json",
		)))
	}
}


public class BatchApi(private val http: LolzteamHttpClient) {

    /**
     * Batch
     *
     * Execute multiple API requests at once (separated by comma). Maximum batch jobs is 10.
     * Following methods are unavailable in Batch:
     * - GET /{item_id}/image
     * - /item/fast-sell
     */
	suspend fun batch(body: BatchBatchBody): BatchBatchResponse {
		return http.json.decodeFromJsonElement(serializer(), http.request(RequestOptions(
			method = "POST",
			path = "/batch",
			body = http.json.encodeToJsonElement(serializer(), body),
			bodyEncoding = "json",
		)))
	}
}


class MarketClient(config: ClientConfig) : Closeable {
	val category: CategoryApi
	val list: ListApi
	val managing: ManagingApi
	val profile: ProfileApi
	val cart: CartApi
	val purchasing: PurchasingApi
	val customDiscounts: CustomDiscountsApi
	val publishing: PublishingApi
	val payments: PaymentsApi
	val autoPayments: AutoPaymentsApi
	val proxy: ProxyApi
	val imap: ImapApi
	val batch: BatchApi

	private val http: LolzteamHttpClient

	init {
		http = LolzteamHttpClient(config.copy(
			baseUrl = config.baseUrl ?: "https://prod-api.lzt.market",
			rateLimit = config.rateLimit ?: RateLimitConfig(requestsPerMinute = 120),
			searchRateLimit = config.searchRateLimit ?: RateLimitConfig(requestsPerMinute = 20),
		))
		category = CategoryApi(http)
		list = ListApi(http)
		managing = ManagingApi(http)
		profile = ProfileApi(http)
		cart = CartApi(http)
		purchasing = PurchasingApi(http)
		customDiscounts = CustomDiscountsApi(http)
		publishing = PublishingApi(http)
		payments = PaymentsApi(http)
		autoPayments = AutoPaymentsApi(http)
		proxy = ProxyApi(http)
		imap = ImapApi(http)
		batch = BatchApi(http)
	}

	override fun close() {
		http.close()
	}

	companion object {
		fun create(token: String): MarketClient = MarketClient(ClientConfig(token = token))
	}
}

