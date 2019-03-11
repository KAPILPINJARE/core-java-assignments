class Television
{
    private String tvPower;
    private int currentVolume;
    private int currentChannel;
    
    public void setTvPower(String tvPower)
    {
        this.tvPower = tvPower;
    }
    public String currentPowerStatus()
    {
         return tvPower;
    }
    
    public void setCurrentVolume(int currentVolume)
    {
         this.currentVolume = currentVolume;
    }
    public int getCurrentVolume()
    {
         return currentVolume;
    }
    
    public void setCurrentChannel(int currentChannel)
    {
         this.currentChannel = currentChannel;
    }
    public int getCurrentChannel()
    {
         return currentChannel;
    }
}