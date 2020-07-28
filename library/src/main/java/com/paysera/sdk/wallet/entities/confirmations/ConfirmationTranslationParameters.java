package com.paysera.sdk.wallet.entities.confirmations;

import com.google.gson.annotations.SerializedName;
import jdk.internal.jline.internal.Nullable;
import org.joda.money.Money;

import java.util.ArrayList;
import java.util.List;

public class ConfirmationTranslationParameters {

    @Nullable
    @SerializedName("%phone%")
    private String phone;

    @Nullable
    @SerializedName("%email%")
    private String email;

    @SerializedName("transfers_money_sums")
    private List<Money> transfersMoneySums = new ArrayList<>();

    @Nullable
    @SerializedName("beneficiary_account")
    private String beneficiaryAccount;

    @Nullable
    @SerializedName("transfers_count")
    private Integer transfersCount;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Money> getTransfersMoneySums() {
        return transfersMoneySums;
    }

    public void setTransfersMoneySums(List<Money> transfersMoneySums) {
        this.transfersMoneySums = transfersMoneySums;
    }

    public String getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public Integer getTransfersCount() {
        return transfersCount;
    }

    public void setTransfersCount(Integer transfersCount) {
        this.transfersCount = transfersCount;
    }
}
