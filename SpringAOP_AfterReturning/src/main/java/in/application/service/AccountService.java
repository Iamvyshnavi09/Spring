package in.application.service;

import in.application.modal.Account;

public interface AccountService {

	Account getAccountByCustomerId(String customerId) throws Exception;

}
