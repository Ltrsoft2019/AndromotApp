package com.ltrsoft.andromotapp.pojoclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SenseCropNPKModel {

//This response api made for only read operation don't get change
    @SerializedName("user_crop_sensor_id")
    @Expose
    private String userCropSensorId;
    @SerializedName("crop_id")
    @Expose
    private int cropId;
    @SerializedName("sensor_client_id")
    @Expose
    private String sensorClientId;
    @SerializedName("date_ucs")
    @Expose
    private String dateUcs;
    @SerializedName("threshold_value")
    @Expose
    private String thresholdValue;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("deleted_at")
    @Expose
    private String deletedAt;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("crop_name")
    @Expose
    private String cropName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("crop_image")
    @Expose
    private String cropImage;
    @SerializedName("required_threshold_value")
    @Expose
    private String requiredThresholdValue;
    @SerializedName("user_client_list_id")
    @Expose
    private String userClientListId;
    @SerializedName("distributer_client_id")
    @Expose
    private String distributerClientId;
    @SerializedName("client_id")
    @Expose
    private String clientId;
    @SerializedName("client_moisture_value")
    @Expose
    private String clientMoistureValue;
    @SerializedName("n_nitrogen")
    @Expose
    private String nNitrogen;
    @SerializedName("p_phosphorus")
    @Expose
    private String pPhosphorus;
    @SerializedName("k_potassium")
    @Expose
    private String kPotassium;
    @SerializedName("client_status")
    @Expose
    private String clientStatus;
    @SerializedName("client_warranty_end_date")
    @Expose
    private String clientWarrantyEndDate;
    @SerializedName("server_sensor_id")
    @Expose
    private String serverSensorId;
    @SerializedName("distributer_cock_id")
    @Expose
    private String distributerCockId;
    @SerializedName("cock_id")
    @Expose
    private String cockId;
    @SerializedName("user_fname")
    @Expose
    private String userFname;
    @SerializedName("user_mname")
    @Expose
    private String userMname;
    @SerializedName("user_lname")
    @Expose
    private String userLname;
    @SerializedName("user_phone")
    @Expose
    private String userPhone;
    @SerializedName("user_image")
    @Expose
    private String userImage;
    @SerializedName("user_address")
    @Expose
    private String userAddress;
    @SerializedName("user_aadhar")
    @Expose
    private String userAadhar;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("email_id")
    @Expose
    private String  emailId;
    @SerializedName("password")
    @Expose
    private String  password;

    public SenseCropNPKModel(String userCropSensorId, int cropId, String sensorClientId, String dateUcs, String thresholdValue, String createdAt, String updatedAt, String deletedAt, String userId, String cropName, String description, String cropImage, String requiredThresholdValue, String userClientListId, String distributerClientId, String clientId, String clientMoistureValue, String nNitrogen, String pPhosphorus, String kPotassium, String clientStatus, String clientWarrantyEndDate, String serverSensorId, String distributerCockId, String cockId, String userFname, String userMname, String userLname, String userPhone, String userImage, String userAddress, String userAadhar, String state, String city, String country, String district, String emailId, String password) {
        this.userCropSensorId = userCropSensorId;
        this.cropId = cropId;
        this.sensorClientId = sensorClientId;
        this.dateUcs = dateUcs;
        this.thresholdValue = thresholdValue;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.userId = userId;
        this.cropName = cropName;
        this.description = description;
        this.cropImage = cropImage;
        this.requiredThresholdValue = requiredThresholdValue;
        this.userClientListId = userClientListId;
        this.distributerClientId = distributerClientId;
        this.clientId = clientId;
        this.clientMoistureValue = clientMoistureValue;
        this.nNitrogen = nNitrogen;
        this.pPhosphorus = pPhosphorus;
        this.kPotassium = kPotassium;
        this.clientStatus = clientStatus;
        this.clientWarrantyEndDate = clientWarrantyEndDate;
        this.serverSensorId = serverSensorId;
        this.distributerCockId = distributerCockId;
        this.cockId = cockId;
        this.userFname = userFname;
        this.userMname = userMname;
        this.userLname = userLname;
        this.userPhone = userPhone;
        this.userImage = userImage;
        this.userAddress = userAddress;
        this.userAadhar = userAadhar;
        this.state = state;
        this.city = city;
        this.country = country;
        this.district = district;
        this.emailId = emailId;
        this.password = password;
    }

    public String getUserCropSensorId() {
        return userCropSensorId;
    }

    public void setUserCropSensorId(String userCropSensorId) {
        this.userCropSensorId = userCropSensorId;
    }

    public int getCropId() {
        return cropId;
    }

    public void setCropId(int cropId) {
        this.cropId = cropId;
    }

    public String getSensorClientId() {
        return sensorClientId;
    }

    public void setSensorClientId(String sensorClientId) {
        this.sensorClientId = sensorClientId;
    }

    public String getDateUcs() {
        return dateUcs;
    }

    public void setDateUcs(String dateUcs) {
        this.dateUcs = dateUcs;
    }

    public String getThresholdValue() {
        return thresholdValue;
    }

    public void setThresholdValue(String thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCropImage() {
        return cropImage;
    }

    public void setCropImage(String cropImage) {
        this.cropImage = cropImage;
    }

    public String getRequiredThresholdValue() {
        return requiredThresholdValue;
    }

    public void setRequiredThresholdValue(String requiredThresholdValue) {
        this.requiredThresholdValue = requiredThresholdValue;
    }

    public String getUserClientListId() {
        return userClientListId;
    }

    public void setUserClientListId(String userClientListId) {
        this.userClientListId = userClientListId;
    }

    public String getDistributerClientId() {
        return distributerClientId;
    }

    public void setDistributerClientId(String distributerClientId) {
        this.distributerClientId = distributerClientId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientMoistureValue() {
        return clientMoistureValue;
    }

    public void setClientMoistureValue(String clientMoistureValue) {
        this.clientMoistureValue = clientMoistureValue;
    }

    public String getnNitrogen() {
        return nNitrogen;
    }

    public void setnNitrogen(String nNitrogen) {
        this.nNitrogen = nNitrogen;
    }

    public String getpPhosphorus() {
        return pPhosphorus;
    }

    public void setpPhosphorus(String pPhosphorus) {
        this.pPhosphorus = pPhosphorus;
    }

    public String getkPotassium() {
        return kPotassium;
    }

    public void setkPotassium(String kPotassium) {
        this.kPotassium = kPotassium;
    }

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

    public String getClientWarrantyEndDate() {
        return clientWarrantyEndDate;
    }

    public void setClientWarrantyEndDate(String clientWarrantyEndDate) {
        this.clientWarrantyEndDate = clientWarrantyEndDate;
    }

    public String getServerSensorId() {
        return serverSensorId;
    }

    public void setServerSensorId(String serverSensorId) {
        this.serverSensorId = serverSensorId;
    }

    public String getDistributerCockId() {
        return distributerCockId;
    }

    public void setDistributerCockId(String distributerCockId) {
        this.distributerCockId = distributerCockId;
    }

    public String getCockId() {
        return cockId;
    }

    public void setCockId(String cockId) {
        this.cockId = cockId;
    }

    public String getUserFname() {
        return userFname;
    }

    public void setUserFname(String userFname) {
        this.userFname = userFname;
    }

    public String getUserMname() {
        return userMname;
    }

    public void setUserMname(String userMname) {
        this.userMname = userMname;
    }

    public String getUserLname() {
        return userLname;
    }

    public void setUserLname(String userLname) {
        this.userLname = userLname;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserAadhar() {
        return userAadhar;
    }

    public void setUserAadhar(String userAadhar) {
        this.userAadhar = userAadhar;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
