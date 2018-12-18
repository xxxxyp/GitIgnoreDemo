package dao;

import java.util.List;

import pojo.SearchTtansactionInfo;

public interface SearchTransactionMapper {

	public void insertBatch(List<SearchTtansactionInfo> searchTtansactionInfo);
}
