package com.cobo.custody.api.client;

import com.cobo.custody.api.client.domain.ApiResponse;
import com.cobo.custody.api.client.domain.account.MPCAddresses;
import com.cobo.custody.api.client.domain.account.MPCChains;
import com.cobo.custody.api.client.domain.account.MPCCoins;
import com.cobo.custody.api.client.domain.account.OrgInfo;
import com.cobo.custody.api.client.domain.asset.MPCWalletAsset;
import com.cobo.custody.api.client.domain.transaction.MPCTransaction;
import com.cobo.custody.api.client.domain.transaction.MPCTransactionInfo;
import com.cobo.custody.api.client.domain.transaction.MPCTransactions;

import java.math.BigInteger;

public interface CoboMPCApiRestClient {
    ApiResponse<OrgInfo> getOrgInfo();
    ApiResponse<MPCChains> getSupportedChains();
    ApiResponse<MPCCoins> getSupportedCoins(String chainCode);
    ApiResponse<MPCAddresses> batchGenerateNewAddresses(String chainCode, int count);
    ApiResponse<MPCAddresses> getAddressList(String chainCode, int pageIndex, int pageLength, Integer sortFlag);
    ApiResponse<MPCWalletAsset> getWalletAssetList(String address, String chainCode);
    ApiResponse<Void> createTransaction(String coin, String requestId, String fromAddr, String toAddr, BigInteger amount);
    ApiResponse<MPCTransactionInfo> getTransaction(String requestId);
    ApiResponse<MPCTransactionInfo> getTransactionByTxId(String txId);
    ApiResponse<MPCTransactions> listWalletTransactions(String address, String coin,
                                                        String maxId, String minId,
                                                        Integer limit);
}
