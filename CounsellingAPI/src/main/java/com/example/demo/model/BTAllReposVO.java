package com.example.demo.model;

import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import java.io.Serializable;
import java.util.List;

public class BTAllReposVO implements Serializable, ToString2 {

    List<BTGitHubRepoVO> btGitHubRepoVOList;

    public BTAllReposVO() {
    }

    public List<BTGitHubRepoVO> getBtGitHubRepoVOList() {
        return btGitHubRepoVOList;
    }

    public void setBtGitHubRepoVOList(List<BTGitHubRepoVO> btGitHubRepoVOList) {
        this.btGitHubRepoVOList = btGitHubRepoVOList;
    }

    public BTAllReposVO(List<BTGitHubRepoVO> btGitHubRepoVOList) {
        this.btGitHubRepoVOList = btGitHubRepoVOList;
    }

    @Override
    public StringBuilder append(ObjectLocator objectLocator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(objectLocator, this, buffer);
        this.appendFields(objectLocator, buffer, strategy);
        strategy.appendEnd(objectLocator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator objectLocator, StringBuilder stringBuilder, ToStringStrategy2 toStringStrategy2) {
        return null;
    }

    public String toString() {
        ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        StringBuilder buffer = new StringBuilder();
        this.append((ObjectLocator) null, buffer, strategy);
        return buffer.toString();
    }
}
